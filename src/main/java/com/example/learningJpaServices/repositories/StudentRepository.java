package com.example.learningJpaServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.learningJpaServices.entities.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

}
