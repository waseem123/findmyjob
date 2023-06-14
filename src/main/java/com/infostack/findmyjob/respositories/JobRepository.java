package com.infostack.findmyjob.respositories;

import com.infostack.findmyjob.models.Job;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface JobRepository extends CrudRepository<Job,Long> {
    @Query("select j from Job j " +
            "where j.jobTitle like ?1 or j.jobCategory like ?1 or j.jobLocation like ?1 " +
            "order by j.lastDateToApply")
    List<Job> getJobsBySearchQuery(String searchQuery);
}
