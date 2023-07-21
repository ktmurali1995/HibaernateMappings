package com.interview.test.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="DEPARTMENT")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Department  {

    @Id
    @GenericGenerator(name = "depGen",strategy = "increment")
    @GeneratedValue(generator = "depGen")
    private Integer deptId;
    @Column(name = "DEPT_NAME")
    private String deptName;
    @Column(name = "DEPT_HEAD")
    private String deptHead;
    @OneToMany(targetEntity = Employee.class,fetch = FetchType.LAZY,mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Employee> employees;


}
