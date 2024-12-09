package com.example.learningJpaServices.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.learningJpaServices.entities.StudentEntity;
import com.example.learningJpaServices.repositories.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;
	
	public ArrayList<StudentEntity> getAllStudents(){
		return (ArrayList<StudentEntity>) studentRepository.findAll();	
	}
	public Optional<StudentEntity> getStudentById(int id){
		return studentRepository.findById(id);
	}
	public StudentEntity addStudent(StudentEntity studentEntity){
		return studentRepository.save(studentEntity);
	}
}
