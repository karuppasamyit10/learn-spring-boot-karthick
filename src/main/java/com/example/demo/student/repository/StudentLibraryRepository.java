package com.example.demo.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.student.service.StudentLibrary;

public interface StudentLibraryRepository  extends JpaRepository<StudentLibrary,Integer>{

}
