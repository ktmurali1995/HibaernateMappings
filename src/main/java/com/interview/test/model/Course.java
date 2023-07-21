package com.interview.test.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="COURSE")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Course {
    @Id
    @GenericGenerator(name = "course_sequence",strategy = "increment")
    @GeneratedValue(generator = "course_sequence")
    private Integer id;
    @Column(name = "name")
    private String name;
    @ManyToMany(cascade = { CascadeType.ALL },mappedBy = "courses",targetEntity =Student.class )
    @JsonIgnore
    private Set<Student> students;


    public void removeStudent(Student student) {
        this.getStudents().remove(student);
        student.getCourses().remove(this);
    }

    public void removeStudents() {
        for (Student student : new HashSet<>(students)) {
            removeStudent(student);
        }
    }

}
