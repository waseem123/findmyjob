package com.infostack.findmyjob.services;

import com.infostack.findmyjob.models.Job;
import com.infostack.findmyjob.respositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    JobRepository jobRepository;

    public boolean createJob(Job j) {
        Job savedJob = jobRepository.save(j);
        if (savedJob != null) {
            return true;
        } else {
            return false;
        }
    }

    public List<Job> getAllJobs() {
        List<Job> jobList = (List<Job>) jobRepository.findAll();
        return jobList;
    }
}
