package com.exam.demothymeleaf.repository;

import com.exam.demothymeleaf.entity.employeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<employeeEntity, Long> {
}
