package com.example.learningJpaServices.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.learningJpaServices.entities.StudentEntity;
import com.example.learningJpaServices.services.StudentService;

@RequestMapping("/students/")
@RestController
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@GetMapping("all")
	public ArrayList<StudentEntity> getAllStudents(){
		return studentService.getAllStudents();
	}
	@GetMapping("{id}")
	public Optional<StudentEntity> getStudentsById(@PathVariable int id) {
		return studentService.getStudentById(id);
	}
	
	@PostMapping("save")
	public StudentEntity studentAdd(@RequestBody StudentEntity studentEntity) {
		return studentService.addStudent(studentEntity);
	}
}
