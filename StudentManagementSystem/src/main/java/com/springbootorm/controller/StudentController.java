package com.springbootorm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootorm.entity.Student;
import com.springbootorm.service.StudentService;

import jakarta.validation.Valid;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;

	// add a student (no ResponseEntity)
	@PostMapping(value = "/students")
	public Student addController(@RequestBody Student student) {
		return studentService.postStudent(student);
	}

	// get a student
	@GetMapping(value = "/students/{id}")
	public Student getController(@PathVariable int id) {
		return studentService.getStudent(id);
	}

	// get all students
	@GetMapping(value = "/students")
	public List<Student> getAllController() {
		return studentService.getAllStudents();
	}

	// update a student
	@PutMapping(value = "/students/{id}")
	public Student updateController(@PathVariable int id, @RequestBody Student student) {
		return studentService.updateStudent(student, id);
	}

	// delete a student
	@DeleteMapping(value = "/students/{id}")
	public String deleteController(@PathVariable int id) {
		return studentService.deleteStudent(id);
	}
}
