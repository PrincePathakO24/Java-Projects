package com.springbootorm.repotest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.springbootorm.entity.Student;
import com.springbootorm.repository.StudentRepository;

@DataJpaTest//this will disable auto configuration and enable h2 database
@AutoConfigureTestDatabase(replace = Replace.NONE)//it will neglect default auto configuration and listen to application properties
@Rollback(false)
class StudentRepositoryTest {
//	@Autowired
//	private TestEntityManager testEntityManager;
//	@Autowired
//	private StudentRepository studentRepository;
//	@Test
//	void testSaveNewStudent() {
//		testEntityManager.persist(new Student(55,"b","mannu@77gmail.com"));
//		Student s=studentRepository.findById(55).get();
//		assertThat(s.getName()).isEqualTo("b");
//	}
//	@Test
//	void testFetchAStudent() {
//		//testEntityManager.persist(new Student(12,"a","vivek@12gmail.com"));
//		Student s=studentRepository.findById(55).get();
//		assertThat(s.getEmail()).isEqualTo("mannu@77gmail.com");
//	}
//	@Test
//	void testUpdateStudent()
//	{
//		Student s=studentRepository.findById(55).get();
//		s.setEmail("mannu@hotmail.com");
//		s.setName("mannu"); 
//		testEntityManager.persist(s);
//		Student sUpdated=studentRepository.findById(55).get();
//		assertThat(sUpdated.getName()).isEqualTo("mannu");
//	}

}
