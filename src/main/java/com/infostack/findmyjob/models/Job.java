package com.infostack.findmyjob.models;

import javax.persistence.*;

@Entity
@Table(name = "tbl_job")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id", nullable = false)
    private Long jobId;
    @Column(name = "job_title", nullable = false)
    private String jobTitle;
    @Column(name = "job_category", nullable = false)
    private String jobCategory;
    @Column(name = "job_role", nullable = false)
    private String jobRole;
    @Column(name = "job_salary", nullable = false)
    private int jobSalary;
    @Column(name = "job_location", nullable = false)
    private String jobLocation;
    @Column(name = "job_skills", nullable = false)
    private String requiredSkills;
    @Column(name = "job_experience", nullable = false)
    private int requiredExperience;
    @Column(name = "job_lastdate", nullable = false)
    private String lastDateToApply;

    public Job() {
    }

    public Job(Long jobId, String jobTitle, String jobCategory, String jobRole, int jobSalary, String jobLocation, String requiredSkills, int requiredExperience, String lastDateToApply) {
        this.jobId = jobId;
        this.jobTitle = jobTitle;
        this.jobCategory = jobCategory;
        this.jobRole = jobRole;
        this.jobSalary = jobSalary;
        this.jobLocation = jobLocation;
        this.requiredSkills = requiredSkills;
        this.requiredExperience = requiredExperience;
        this.lastDateToApply = lastDateToApply;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobCategory() {
        return jobCategory;
    }

    public void setJobCategory(String jobCategory) {
        this.jobCategory = jobCategory;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public int getJobSalary() {
        return jobSalary;
    }

    public void setJobSalary(int jobSalary) {
        this.jobSalary = jobSalary;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }

    public String getRequiredSkills() {
        return requiredSkills;
    }

    public void setRequiredSkills(String requiredSkills) {
        this.requiredSkills = requiredSkills;
    }

    public int getRequiredExperience() {
        return requiredExperience;
    }

    public void setRequiredExperience(int requiredExperience) {
        this.requiredExperience = requiredExperience;
    }

    public String getLastDateToApply() {
        return lastDateToApply;
    }

    public void setLastDateToApply(String lastDateToApply) {
        this.lastDateToApply = lastDateToApply;
    }
}
