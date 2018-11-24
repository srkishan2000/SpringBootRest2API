package com.shan.controllers;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.shan.beans.Student;
import com.shan.beans.StudentRegistration;

public class StudentRegistrationTest {
	
	private Student student;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		student = new Student();
		student.setName("Shanmuga");
		student.setAge(43);
		student.setRegistrationNumber("001");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void should_add_student_registration() {
		StudentRegistration.getInstance().add(student);
		
		// for ADD a Student Registraion
		List<Student> result = StudentRegistration.getInstance().getStudentRecords();
		
		assertThat(result).contains(student);
	}
	
	@Test
	public void should_update_student_registration() {
		// for Update a Student Registration
		student.setAge(50);
		student.setName("Testing");
		StudentRegistration.getInstance().updateStudent(student);
		List<Student> updateResult = StudentRegistration.getInstance().getStudentRecords();
		
		assertThat(updateResult.get(0).getAge()).isEqualTo(50) ;
		assertThat(updateResult.get(0).getName()).isEqualTo("Testing");
	}
	
	@Test
	public void should_delete_student_registration() {
		// for delete a Student Registration
		StudentRegistration.getInstance().deleteStudent("001");
		List<Student> deleteResult = StudentRegistration.getInstance().getStudentRecords();
		
		assertThat(deleteResult).isEmpty();
	}

}
