package com.spring.springDto.controller;

import com.spring.springDto.dto.StudentDto;
import com.spring.springDto.model.Student;
import com.spring.springDto.model.StudentResponse;
import com.spring.springDto.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/all")
    public List<Student> getAll(){
        return studentService.getStudentsAll();
    }

    @GetMapping("/id-name")
    public List<StudentDto> getIdAndName(){
        return studentService.getStudents();
    }

    @GetMapping("/name/{id}")
    public StudentResponse getName(@PathVariable("id")int id){
        return studentService.getStudentName(id);
    }
}
