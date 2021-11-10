package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.mapping.TeacherDetails;

public interface TeacherRepository extends JpaRepository<TeacherDetails,Integer>{

}
