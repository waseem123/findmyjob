package com.infostack.findmyjob.models;

import javax.persistence.*;

@Entity
@Table(name = "tbl_application")
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "application_id", nullable = false)
    private Long applicationId;
    @ManyToOne
    @JoinColumn(name = "job_job_id")
    private Job job;
    @ManyToOne
    @JoinColumn(name = "job_seeker_jobseeker_id")
    private JobSeeker jobSeeker;

    public JobSeeker getJobSeeker() {
        return jobSeeker;
    }

    public void setJobSeeker(JobSeeker jobSeeker) {
        this.jobSeeker = jobSeeker;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

}
