package com.infostack.findmyjob.services;

import com.infostack.findmyjob.models.Application;
import com.infostack.findmyjob.models.ApplicationRepository;
import com.infostack.findmyjob.models.Job;
import com.infostack.findmyjob.models.JobSeeker;
import com.infostack.findmyjob.respositories.JobRepository;
import com.infostack.findmyjob.respositories.JobSeekerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerService {
    @Autowired
    JobSeekerRepository repository;
    @Autowired
    JobRepository jobRepository;
    @Autowired
    ApplicationRepository applicationRepository;

    public JobSeeker login(String email, String password) {
        return repository.jobseekerLogin(email, password);
    }

    public List<Job> getAllJobs() {
        return (List<Job>) jobRepository.findAll();
    }

    public List<Job> getJobsBySearchQuery(String searchquery) {
        return (List<Job>) jobRepository.getJobsBySearchQuery(searchquery);
    }

    public Application applyJob(Application application) {
        return applicationRepository.save(application);
    }

    public Job getJobById(Long job_id) {
        return jobRepository.findById(job_id).get();
    }

    public JobSeeker getJobSeekerById(Long jobseekerID) {
        return repository.findById(jobseekerID).get();
    }

    public List<Application> getAppliedJobs(Long jobseekerID) {
        return (List<Application>) applicationRepository.findAllByJobseekerId(jobseekerID);
    }
}
