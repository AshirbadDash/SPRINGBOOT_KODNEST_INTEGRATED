package com.example.demo.serviceimpl;

import java.util.List;
port java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(int id) {
		Optional<Student> student = studentRepository.findById(id);

		return student.orElse(null);
	}

	@Override
	public Student getStudentByName(String name) {
		Student student = studentRepository.findByName(name);
		return student;

	}

}
