package com.infostack.findmyjob.models;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ApplicationRepository extends CrudRepository<Application,Long> {
    @Query("select a from Application a where a.jobSeeker.jobSeekerId = ?1")
    List<Application> findAllByJobseekerId(Long jobSeekerId);

}
