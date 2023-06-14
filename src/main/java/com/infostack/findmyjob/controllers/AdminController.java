package com.infostack.findmyjob.controllers;

import com.infostack.findmyjob.models.Job;
import com.infostack.findmyjob.models.JobSeeker;
import com.infostack.findmyjob.services.AdminService;
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
public class AdminController {
    @Autowired
    AdminService adminService;
    @Autowired
    JobSeekerService jobSeekerService;

    @RequestMapping("/")
    public String homepage() {
        return "welcome";
    }

    @RequestMapping("/admin")
    public String adminDashboard(ModelMap m) {
        m.addAttribute("username", "Manoj Gajul");
        return "admin-dashboard";
    }

    @RequestMapping("/admin/create-job")
    public String createJob(ModelMap m) {
        return "create-job";
    }

    @RequestMapping("/admin/post-job")
    public String postJob(ModelMap m,
                          @RequestParam(value = "job_title") String job_title,
                          @RequestParam(value = "job_category") String job_category,
                          @RequestParam(value = "job_role") String job_role,
                          @RequestParam(value = "job_salary") String job_salary,
                          @RequestParam(value = "job_location") String job_location,
                          @RequestParam(value = "job_skills") String job_skills,
                          @RequestParam(value = "job_experience") String job_experience,
                          @RequestParam(value = "job_lastdate") String job_lastdate
    ) {
        Job job = new Job();
        job.setJobTitle(job_title);
        job.setJobCategory(job_category);
        job.setJobRole(job_role);
        job.setJobSalary(Integer.parseInt(job_salary));
        job.setJobLocation(job_location);
        job.setRequiredSkills(job_skills);
        job.setRequiredExperience(Integer.parseInt(job_experience));
        job.setLastDateToApply(job_lastdate);

        boolean result = adminService.createJob(job);
        if (result == true) {
            System.out.println(job_title + " - Job Posted Succesfully");
        } else {
            System.out.println("Unable to post a job");
        }
        return "redirect:/admin/view-jobs";
    }

    @RequestMapping("/admin/view-jobs")
    public String viewJobs(ModelMap m) {
        List<Job> jobList = adminService.getAllJobs();
        m.addAttribute("jobList", jobList);
        return "view-jobs";
    }




}
