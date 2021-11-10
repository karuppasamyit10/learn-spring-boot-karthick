package com.example.demo.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.student.service.CollegeManagement;

public interface CollegeManagementRepository extends JpaRepository<CollegeManagement,String>{

}
