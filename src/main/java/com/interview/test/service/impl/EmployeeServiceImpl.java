package com.interview.test.service.impl;

import com.interview.test.model.Department;
import com.interview.test.model.Employee;
import com.interview.test.repository.DepartmentRepository;
import com.interview.test.repository.EmployeeRepository;
import com.interview.test.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
   @Autowired
    private EmployeeRepository employeeRepository;
   @Autowired
   private DepartmentRepository departmentRepository;

   @Override
   public Employee getEmployee(Integer employeeId)
   {
       return employeeRepository.findById(employeeId).get();
   }
    @Override
    public List<Employee> getAllEmployee()
    {
        return employeeRepository.findAll();
    }
    @Override
    @Transactional
    public Employee saveEmployee(Employee employee)
    {

        Department dept = departmentRepository.findById(employee.getDepartment().getDeptId()).orElse(null);
        if (null == dept) {
            dept = new Department();
        }
        dept.setDeptName(employee.getDepartment().getDeptName());
        dept.setDeptHead(employee.getDepartment().getDeptHead());
        employee.setDepartment(dept);
        return employeeRepository.save(employee);
    }
    @Override
    @Transactional
    public Employee editEmployee(Employee employee)
    {

        Department dept = departmentRepository.findById(employee.getDepartment().getDeptId()).orElse(null);
        if (null == dept) {
            dept = new Department();
        }
        dept.setDeptName(employee.getDepartment().getDeptName());
        dept.setDeptHead(employee.getDepartment().getDeptHead());
        employee.setDepartment(dept);
        return employeeRepository.save(employee);
    }
   @Override
   @Transactional
    public void deleteEmployeeById(Integer employeeId)
    {
         employeeRepository.deleteById(employeeId);
    }


}
