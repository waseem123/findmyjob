package com.infostack.findmyjob.controllers;

import com.infostack.findmyjob.models.Application;
import com.infostack.findmyjob.models.Job;
import com.infostack.findmyjob.models.JobSeeker;
import com.infostack.findmyjob.services.JobSeekerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class JobSeekerController {
    @Autowired
    JobSeekerService jobSeekerService;

    @RequestMapping("/jobseeker")
    public String jobSeekerDashboard(HttpServletRequest request) {
        HttpSession session = request.getSession();
        if (session.getAttribute("jobseekerID") != null) {
            return "jobseeker-dashboard";
        }
        return "redirect:/jobseeker-login";
    }

    @RequestMapping("/jobseeker-login")
    public String jobSeekerLogin(HttpServletRequest request) {
        HttpSession session = request.getSession();
        if (session.getAttribute("jobseekerID") == null) {
            return "login";
        }
        return "redirect:/jobseeker";
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request,
                        @RequestParam("useremail") String email,
                        @RequestParam("password") String password
    ) {
        JobSeeker js = jobSeekerService.login(email, password);
        if (js != null) {
            HttpSession session = request.getSession();
            session.setAttribute("jobseekerID", js.getJobSeekerId());
            session.setAttribute("jobseekerName", js.getJobSeekerName());
            return "redirect:/jobseeker";
        } else {
            return "redirect:/jobseeker-login";
        }

    }

    @RequestMapping("/jobseeker-logout")
    public String logout(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.invalidate();
        return "redirect:/jobseeker-login";
    }


    @RequestMapping("/jobseeker/view-jobs")
    public String viewAllJobs(HttpServletRequest request, ModelMap map) {
        HttpSession session = request.getSession();
        if (session.getAttribute("jobseekerID") != null) {
            List<Job> jobList = jobSeekerService.getAllJobs();
            map.addAttribute("jobList", jobList);
            return "jobseeker-view-jobs";
        }
        return "redirect:/jobseeker-login";
    }

    @RequestMapping("/jobseeker/view-jobs/{searchquery}")
    public String viewAllJobs(HttpServletRequest request, ModelMap map, @PathVariable("searchquery") String searchquery) {
        HttpSession session = request.getSession();
        if (session.getAttribute("jobseekerID") != null) {
            List<Job> jobList = jobSeekerService.getJobsBySearchQuery(searchquery);
            map.addAttribute("jobList", jobList);
            return "jobseeker-view-jobs";
        }
        return "redirect:/jobseeker-login";
    }

    @RequestMapping("/jobseeker/apply")
    public String apply(HttpServletRequest request, ModelMap map,
                        @RequestParam(value = "job_id") Long job_id) {
        HttpSession session = request.getSession();
        if (session.getAttribute("jobseekerID") != null) {

            Job j = jobSeekerService.getJobById(job_id);
            Long jobseekerID = (Long) session.getAttribute("jobseekerID");
            JobSeeker js = jobSeekerService.getJobSeekerById(jobseekerID);
            Application application = jobSeekerService.applyJob(js, j);
            return "redirect:/jobseeker/view-jobs";
        }
        return "redirect:/jobseeker-login";
    }

    /*@RequestMapping("/jobseeker/applied-jobs")
    public String appliedJobs(HttpServletRequest request, ModelMap map) {
        HttpSession session = request.getSession();
        if (session.getAttribute("jobseekerID") != null) {
            Long jobseekerID = (Long) session.getAttribute("jobseekerID");
            JobSeeker js = jobSeekerService.getJobSeekerById(jobseekerID);
            List<Job> jobList = jobSeekerService.getAppliedJobs(js);
            map.addAttribute("jobList", jobList);
            return "jobseeker-view-jobs";
        }
        return "redirect:/jobseeker-login";
    }*/
}
