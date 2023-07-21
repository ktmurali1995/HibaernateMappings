package com.interview.test.controller;

import com.interview.test.model.Employee;

import com.interview.test.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/employee")
public class EmployeeControllerBiDirectional {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getEmployee/{employeeId}")
    public Employee getEmployee(@PathVariable Integer employeeId)
    {
        return employeeService.getEmployee(employeeId);
    }
    @GetMapping("getAllEmployees")
    public List<Employee> getAllEmployee()
    {
        return employeeService.getAllEmployee();
    }

    @PostMapping("/saveEmployee")
    public Employee saveEmployee(@RequestBody Employee employee)
    {
        return employeeService.saveEmployee(employee);
    }
    @PutMapping("/editEmployee")
    public Employee editEmployee(@RequestBody Employee employee)
    {
        return employeeService.editEmployee(employee);
    }
    @DeleteMapping("/deleteEmployeeById/{employeeId}")
    public void deleteEmployeeById(@PathVariable Integer employeeId)
    {
        employeeService.deleteEmployeeById(employeeId);
    }

}
