package com.spring.springDto.Repository;

import com.spring.springDto.model.Course;
import com.spring.springDto.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course,Integer> {
}
