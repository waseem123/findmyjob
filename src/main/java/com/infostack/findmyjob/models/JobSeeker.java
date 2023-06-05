package com.infostack.findmyjob.models;

import javax.persistence.*;

@Entity
@Table(name = "tbl_jobseeker")
public class JobSeeker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "jobseeker_id", nullable = false)
    private Long jobSeekerId;
    @Column(name = "jobseeker_name", nullable = false)
    private String jobSeekerName;
    @Column(name = "jobseeker_email", nullable = false)
    private String jobSeekerEmail;
    @Column(name = "jobseeker_mobileno", nullable = false)
    private String jobSeekerMobileNo;
    @Column(name = "jobseeker_address")
    private String jobSeekerAddress;
    @Column(name = "jobseeker_password", nullable = false)
    private String jobSeekerPassword;

    public JobSeeker() {
        super();
    }

    public JobSeeker(Long jobSeekerId, String jobSeekerName, String jobSeekerEmail, String jobSeekerMobileNo,
                     String jobSeekerAddress, String jobSeekerPassword) {
        super();
        this.jobSeekerId = jobSeekerId;
        this.jobSeekerName = jobSeekerName;
        this.jobSeekerEmail = jobSeekerEmail;
        this.jobSeekerMobileNo = jobSeekerMobileNo;
        this.jobSeekerAddress = jobSeekerAddress;
        this.jobSeekerPassword = jobSeekerPassword;
    }

    public Long getJobSeekerId() {
        return jobSeekerId;
    }

    public void setJobSeekerId(Long jobSeekerId) {
        this.jobSeekerId = jobSeekerId;
    }

    public String getJobSeekerName() {
        return jobSeekerName;
    }

    public void setJobSeekerName(String jobSeekerName) {
        this.jobSeekerName = jobSeekerName;
    }

    public String getJobSeekerEmail() {
        return jobSeekerEmail;
    }

    public void setJobSeekerEmail(String jobSeekerEmail) {
        this.jobSeekerEmail = jobSeekerEmail;
    }

    public String getJobSeekerMobileNo() {
        return jobSeekerMobileNo;
    }

    public void setJobSeekerMobileNo(String jobSeekerMobileNo) {
        this.jobSeekerMobileNo = jobSeekerMobileNo;
    }

    public String getJobSeekerAddress() {
        return jobSeekerAddress;
    }

    public void setJobSeekerAddress(String jobSeekerAddress) {
        this.jobSeekerAddress = jobSeekerAddress;
    }

    public String getJobSeekerPassword() {
        return jobSeekerPassword;
    }

    public void setJobSeekerPassword(String jobSeekerPassword) {
        this.jobSeekerPassword = jobSeekerPassword;
    }


}
