package com.springbootorm.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.springbootorm.entity.Student;

@Component
public interface StudentService {

	Student postStudent(Student s);

	Student getStudent(int id);

	List<Student> getAllStudents();

	Student updateStudent(Student params, int id);

	String deleteStudent(int id);

}
