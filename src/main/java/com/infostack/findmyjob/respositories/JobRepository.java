package com.infostack.findmyjob.respositories;

import com.infostack.findmyjob.models.Job;
import org.springframework.data.repository.CrudRepository;

public interface JobRepository extends CrudRepository<Job,Long> {
}
