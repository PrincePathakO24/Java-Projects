package com.springbootorm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootorm.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
