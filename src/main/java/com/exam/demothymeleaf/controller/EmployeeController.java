package com.exam.demothymeleaf.controller;

import com.exam.demothymeleaf.entity.employeeEntity;
import com.exam.demothymeleaf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {

    private final   EmployeeService employeeService;
     ;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/")
    public String getAllEmployee(Model model) {
        model.addAttribute("allEmployee", employeeService.getAllEmployee());
        model.addAttribute("employeeEntity", new employeeEntity());
        return "index";
    }

    @PostMapping("/create-new-employee")
    public String createNewEmployee(@ModelAttribute(value = "employeeEntity") employeeEntity employeeEntity) {
        employeeService.createNewEmployee(employeeEntity);
        return "redirect:/";
    }

    @GetMapping("/delete-employee-by-id/{id}")
    public String deleteStudentById(@PathVariable(value = "id") Long id) throws Exception {
        employeeService.deleteEmployeeById(id);
        return "redirect:/";
    }
}
