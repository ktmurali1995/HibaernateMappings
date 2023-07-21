package com.interview.test.model;


import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="STUDENT")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {

    @Id
    @GenericGenerator(name = "student_sequence",strategy = "increment")
    @GeneratedValue(generator = "student_sequence")
    private Integer id;
    @Column(name = "name")
    private String name;
    @ManyToMany(cascade = { CascadeType.ALL },targetEntity = Course.class)
    @JoinTable(name = "STUDENT_COURSE", joinColumns = { @JoinColumn(name = "STUDENT_ID") }, inverseJoinColumns = {
            @JoinColumn(name = "COURSE_ID") })
    private Set<Course> courses;
    public void addCourse(Course course) {
        this.courses.add(course);
        course.getStudents().add(this);
    }
    public void removeCourse(Course course) {
        this.getCourses().remove(course);
        course.getStudents().remove(this);
    }
    public void removeCourses() {
        for (Course course : new HashSet<>(courses)) {
            removeCourse(course);
        }
    }
}
