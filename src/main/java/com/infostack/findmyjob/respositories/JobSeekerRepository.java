package com.infostack.findmyjob.respositories;

import com.infostack.findmyjob.models.JobSeeker;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobSeekerRepository extends CrudRepository<JobSeeker,Long> {
    @Query("select j from JobSeeker j where j.jobSeekerEmail = ?1 and j.jobSeekerPassword = ?2")
    JobSeeker jobseekerLogin(String jobSeekerEmail, String jobSeekerPassword);

}
