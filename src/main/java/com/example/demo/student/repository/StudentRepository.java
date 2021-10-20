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
	

	
	@Query(value="SELECT * FROM student s WHERE s.stu_name = :stuName ", nativeQuery=true)
	List<Student> findByStuName(@Param("stuName")String stuName);
	
	@Query(value="SELECT * FROM student s WHERE s.stu_dep_name = :stuDepName ", nativeQuery=true)
	List<Student> findByStuDepName(@Param("stuDepName")String stuDepName);
	 
	
	List<Student> findByStuNameAndStuDepName(String stuName,String stuDepName);
	
	List<Student> findByStuNameOrStuDepName(String stuName,String stuDepName);

}
