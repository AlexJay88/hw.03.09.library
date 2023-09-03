package com.example.demo;

import java.util.Map;

public interface EmployeeService {
    com.example.demo.Employee addEmployee(String firstName, String lastName, Integer salary, Integer department);
    com.example.demo.Employee  removeEmployee(String firstName, String lastName);
    com.example.demo.Employee findEmployee(String firstName, String lastName);
    Map<String, com.example.demo.Employee> getAllEmployees();
}

