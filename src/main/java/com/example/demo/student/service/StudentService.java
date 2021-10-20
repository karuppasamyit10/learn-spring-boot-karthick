package com.example.demo.student.service;

import com.example.demo.student.entity.Student;

import java.util.List;



public interface StudentService {
Student save(Student student);
Student update(Student student);
Student get(int id);
List<Student> getAllStudent();
List<Student> getByStuName(String stuName);
List<Student> getByStuDepName(String stuDepName);
void delete(int id);

}
