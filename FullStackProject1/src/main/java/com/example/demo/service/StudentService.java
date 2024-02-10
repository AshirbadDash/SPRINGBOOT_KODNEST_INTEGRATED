package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

/**
 * @interface
 */

public interface StudentService {

	public List<Student> getStudents();

	public Student getStudentById(int id);

	public Student getStudentByName(String name);
		
	
	
	
//	
//	org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'studentController': Unsatisfied dependency expressed through field 'studentServiceimpl': Error creating bean with name 'studentServiceImpl': Unsatisfied dependency expressed through field 'studentRepository': Error creating bean with name 'studentRepository' defined in com.example.demo.repository.StudentRepository defined in @EnableJpaRepositories declared on JpaRepositoriesRegistrar.EnableJpaRepositoriesConfiguration: Could not create query for public abstract com.example.demo.entity.Student com.example.demo.repository.StudentRepository.findByName(java.lang.String); Reason: Validation failed for query for method public abstract com.example.de

	
		
	
	
	
}
