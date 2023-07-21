package com.interview.test.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class CourseDto {
    private Integer id;
    private String name;
    Set<String> students = new HashSet<>();
}
