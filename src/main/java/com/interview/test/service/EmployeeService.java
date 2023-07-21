package com.interview.test.service;

import com.interview.test.model.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee getEmployee(Integer employeeId);
    public List<Employee> getAllEmployee();
    public Employee saveEmployee(Employee employee);
    public Employee editEmployee(Employee employee);
    public void deleteEmployeeById(Integer employeeId);
}
