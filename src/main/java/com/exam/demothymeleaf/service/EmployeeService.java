package com.exam.demothymeleaf.service;

import com.exam.demothymeleaf.entity.employeeEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmployeeService {

    List<employeeEntity> getAllEmployee();

    void createNewEmployee(employeeEntity studentEntity);

    void deleteEmployeeById(Long id) throws Exception;

}
