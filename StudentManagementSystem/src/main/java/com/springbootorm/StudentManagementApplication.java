package com.springbootorm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springbootorm.entity.Student;
import com.springbootorm.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementApplication{
	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}
}
