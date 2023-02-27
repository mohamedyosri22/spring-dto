package com.spring.springDto.service;

import com.spring.springDto.Repository.StudentRepo;
import com.spring.springDto.dto.StudentDto;
import com.spring.springDto.model.Student;
import com.spring.springDto.model.StudentResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<Student> getStudentsAll(){
        return studentRepo.findAll();
    }

    public List<StudentDto> getStudents(){
        List<Student> students = studentRepo.findAll();
        List<StudentDto> studentDtos = new ArrayList<>();

        for(Student student : students){
            studentDtos.add(modelMapper.map(student, StudentDto.class));
            //studentDtos.add(new StudentDto(student.getId(),student.getName()));
        }

        return studentDtos;
    }

    public StudentResponse getStudentName(int id){
        Student student = studentRepo.findById(id).get();
        StudentResponse response = modelMapper.map(student,StudentResponse.class); //new StudentResponse(student.getName());

        return response;
    }
}
