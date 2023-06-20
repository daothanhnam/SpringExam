package com.exam.demothymeleaf.service;

import com.exam.demothymeleaf.entity.EmployeeEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmployeeService {

    List<EmployeeEntity> getAllEmployee();

    void createNewEmployee(EmployeeEntity studentEntity);

    void deleteEmployeeById(Long id) throws Exception;

}
