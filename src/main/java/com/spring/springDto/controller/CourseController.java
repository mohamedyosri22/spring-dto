package com.spring.springDto.controller;

import com.spring.springDto.dto.CourseDto;
import com.spring.springDto.dto.StudentDto;
import com.spring.springDto.model.Course;
import com.spring.springDto.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;
    @GetMapping("/all")
    public List<Course> getAll(){
        return courseService.getCoursesAll();
    }

    @GetMapping("/id-name")
    public List<CourseDto> getIdAndName(){
        return courseService.getIdAndName();
    }
}
