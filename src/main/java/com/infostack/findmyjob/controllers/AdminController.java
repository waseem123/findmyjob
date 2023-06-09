package com.infostack.findmyjob.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

    @RequestMapping("/")
    public String homepage(){
        return "welcome";
    }

    @RequestMapping("/admin")
    public String adminDashboard(ModelMap m){
        m.addAttribute("username","Manoj Gajul");
        return "admin-dashboard";
    }

    @RequestMapping("/jobseeker")
    public String jobSeekerDashboard(){
        return "jobseeker-dashboard";
    }

}
