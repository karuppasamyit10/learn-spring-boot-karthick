package com.example.demo.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.student.entity.StudentMark;

@Repository
public interface StudentMarkRepository extends JpaRepository<StudentMark, Integer> {
	

}
