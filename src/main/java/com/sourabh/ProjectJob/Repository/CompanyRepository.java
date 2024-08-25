package com.sourabh.ProjectJob.Repository;

import com.sourabh.ProjectJob.Model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
