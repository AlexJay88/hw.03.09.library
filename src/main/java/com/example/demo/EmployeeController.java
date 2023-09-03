package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
@GetMapping("/add")
    public Employee addEmployee                   (@RequestParam String firstName,
                                                   @RequestParam String lastName,
                                                   @RequestParam  Integer salary, @RequestParam Integer department)
    {
        EmployeeNameValidator.validateIsAlpha(firstName,lastName);
        return employeeService.addEmployee(firstName, lastName,salary,department);

    }
    @GetMapping("/remove")
    public void removeEmployee(@RequestParam String firstName, @RequestParam String lastName) {
        EmployeeNameValidator.validateIsAlpha(firstName,lastName);
        employeeService.removeEmployee(firstName, lastName);
    }
    @GetMapping("/find")
    public Employee findEmployee(@RequestParam String firstName, @RequestParam String lastName) {

        EmployeeNameValidator.validateIsAlpha(firstName,lastName);
        return employeeService.findEmployee(firstName,lastName);
    }

    public Map<String, Employee> getAllEmployees() {
        return   employeeService.getAllEmployees();

    }


    }


