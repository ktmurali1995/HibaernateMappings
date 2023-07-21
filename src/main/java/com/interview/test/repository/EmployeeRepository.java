package com.interview.test.repository;

import com.interview.test.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    @Modifying
    @Query("DELETE FROM Employee e WHERE e.empId = ?1")
    void deleteById(Integer employeeId);
}
