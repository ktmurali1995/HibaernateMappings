package com.interview.test.model;

import com.interview.test.model.Department;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="EMPLOYEE")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    @Id
    @GenericGenerator(name = "empGen",strategy = "increment")
    @GeneratedValue(generator = "empGen")
    private Integer empId;
    @Column(name = "EMP_NAME")
    private String empName;
    @Column(name = "SALARY")
    private double salary;
    @ManyToOne(targetEntity = Department.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(name = "dept_id"), name = "dept_id")
   // @JoinColumn(name = "deptId",referencedColumnName ="deptId")
    private Department department;

}
