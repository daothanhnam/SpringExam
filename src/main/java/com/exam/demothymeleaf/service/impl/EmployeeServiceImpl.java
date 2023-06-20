package com.exam.demothymeleaf.service.impl;

import com.exam.demothymeleaf.entity.EmployeeEntity;
import com.exam.demothymeleaf.repository.EmployeeRepo;
import com.exam.demothymeleaf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public List<EmployeeEntity> getAllEmployee() {
        return employeeRepo.findAll();
    }

    @Override
    public void createNewEmployee(EmployeeEntity employeeEntity) {
        if (ObjectUtils.isEmpty(employeeEntity)) {
            throw new NullPointerException("Employee is empty");
        }
        employeeRepo.save(employeeEntity);
    }

    @Override
    public void deleteEmployeeById(Long id) throws Exception {
        Optional<EmployeeEntity> employeeEntity = employeeRepo.findById(id);
        if (!employeeEntity.isPresent()) {
            throw new Exception("Employee is empty");
        }
        employeeRepo.deleteById(id);
    }
}
