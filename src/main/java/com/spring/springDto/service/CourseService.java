package com.spring.springDto.service;

import com.spring.springDto.Repository.CourseRepo;
import com.spring.springDto.dto.CourseDto;
import com.spring.springDto.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepo courseRepo;

    public List<Course> getCoursesAll(){
        return courseRepo.findAll();
    }

    public List<CourseDto> getIdAndName(){
        List<Course> courses = courseRepo.findAll();
        List<CourseDto> courseDtos = new ArrayList<>();

        for(Course course : courses){
            courseDtos.add(new CourseDto(course.getId(),course.getName()));
        }

        return courseDtos;
    }
    public List<Course> getCourses(){
        return courseRepo.findAll();
    }
}
