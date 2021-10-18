package com.example.demo.student.service.repository;

import com.example.demo.student.entity.Student;

import java.util.List;

public interface StudentService {
Student save(Student student);
Student update(Student student);
Student get(int id);
List<Student> getAllStudent();
List<Student> getAllByName(String name);
void delete(int id);
}
