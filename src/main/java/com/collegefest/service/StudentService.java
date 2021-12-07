package com.collegefest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.collegefest.model.Student;

@Service
public interface StudentService {

	List<Student> findAll();

	void save(Student theStudent);

	Student findById(int theId);

	void deleteById(int theId);

}
