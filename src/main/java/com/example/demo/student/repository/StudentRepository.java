package com.example.demo.student.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.student.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	@Query( value="SELECT * FROM student", nativeQuery=true)
	List<Student> findAllStudent();
	
	@Query(value="SELECT * FROM student WHERE stu_name = :name", nativeQuery=true)
	List<Student> findByStuName(@Param("name")String name);
	

}
