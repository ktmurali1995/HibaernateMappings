package com.interview.test.service;

import com.interview.test.dto.CourseDto;

import java.util.List;

public interface CourseService {
    public CourseDto updateCourse(Integer id, CourseDto course);

    public String deleteCourse(Integer id);

    public CourseDto addCourse(CourseDto courseDto);

    public List<CourseDto> getAllCourses();
}
