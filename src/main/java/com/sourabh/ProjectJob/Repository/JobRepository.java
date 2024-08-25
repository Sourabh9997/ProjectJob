package com.sourabh.ProjectJob.Repository;

import com.sourabh.ProjectJob.Model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
