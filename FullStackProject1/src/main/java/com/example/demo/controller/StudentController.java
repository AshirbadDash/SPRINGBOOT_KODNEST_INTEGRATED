package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.serviceimpl.StudentServiceImpl;

@RestController
public class StudentController {

	@Autowired
	public StudentServiceImpl studentServiceimpl;

	@GetMapping(value = "/get")
	public List<Student> getStudents() {
		return studentServiceimpl.getStudents();
	}

	// get by id

	@GetMapping(value = "/getById/{id}")
	public Student getStudentById(@PathVariable Integer id) {
			
		return studentServiceimpl.getStudentById(id);
	}
	
	// get by name
	@GetMapping(value = "/getByName/{name}")
	public Student getStudentByName(@PathVariable String name) {
		return studentServiceimpl.getStudentByName(name);
	}
	
	

}
