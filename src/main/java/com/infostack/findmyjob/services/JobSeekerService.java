package com.infostack.findmyjob.services;

import com.infostack.findmyjob.models.JobSeeker;
import com.infostack.findmyjob.respositories.JobSeekerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobSeekerService {
    @Autowired
    JobSeekerRepository repository;
    public JobSeeker login(String email,String password){
        return repository.jobseekerLogin(email,password);
    }
}
