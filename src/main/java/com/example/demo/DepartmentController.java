package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    public Employee getEmployeeWithMaxSalary(@RequestParam("departmentId") Integer departmentId) {
        return departmentService.getEmployeeWithMaxSalary(departmentId);

    }

    public Employee getEmployeeWithMinSalary(@RequestParam("departmentId") Integer departmentId) {
        return departmentService.getEmployeeWithMinSalary(departmentId);
    }
    public Map<Integer, List<Employee>>getDivisionByDepartmentEmployees(
            @RequestParam(name = "departmentId",required = false)Integer departmentId
    ){
        return departmentService.getDivisionByDepartmentEmployees(departmentId);

    }
}
