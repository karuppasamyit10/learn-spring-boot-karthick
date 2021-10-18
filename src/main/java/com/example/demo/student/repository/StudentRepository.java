package com.example.demo.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.student.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	
	

	List<Student> findByStuNameContains(String name);
	

}
