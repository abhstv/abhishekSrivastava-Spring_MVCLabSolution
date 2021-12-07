package com.collegefest.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.collegefest.model.Student;
import com.collegefest.service.StudentService;

@Controller
@RequestMapping("/")
public class StudentListController {

	@Autowired
	StudentService service;

	@GetMapping("/")
	public String studentList(Map<String, List<Student>> map) {
		map.put("Students", service.findAll());
		return "studentlist";
	}

	@GetMapping("/add")
	public String add(Map<String, Student> map) {
		map.put("Student", new Student());
		return "registrationform";
	}

	@PostMapping("/save")
	public String save(Student student, @RequestParam int studentId) {
		student.setStudentId(studentId);
		this.service.save(student);
		return "redirect:/";
	}

	@GetMapping("/update")
	public String update(@RequestParam int studentId, Map<String, Student> map) {
		Student student = this.service.findById(studentId);
		map.put("Student", student);
		return "registrationform";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam int studentId) {
		this.service.deleteById(studentId);
		return "redirect:/";
	}

}
