package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.student.entity.Student;
import com.example.demo.student.service.StudentImplement;

import java.util.List;

@RestController
public class StudentController {
	
	@Autowired
	StudentImplement studentimplement;
	
	@RequestMapping(value="/student/add",method=RequestMethod.POST)
	public Student addStudent(Student student){
		Student s=studentimplement.save(student);
		return s;
	}
	
	@RequestMapping(value="/student/get/{id}",method=RequestMethod.GET)
	public Student getStudent(@PathVariable(required=false) int id){
		if(id==0)
		{
			return null;
		}
		Student studentGet=studentimplement.get(id);
		return studentGet;
		
	}
	
	@RequestMapping(value="/student/getAll",method=RequestMethod.GET)
	public List<Student> getAllStudent() 
	{
		return studentimplement.getAllStudent();
	}
	
	@RequestMapping(value="/student/getAllByName",method=RequestMethod.GET)
	public List<Student> getAllByName( String name) 
	
	{
		return studentimplement.getAllByName(name);
		
	}
		
	
	@RequestMapping(value="/student/update",method=RequestMethod.PUT)
	public Student updateStudent(Student student){
		if(student.getId()== 0){
			return null;
		}
		Student studentUpdate=studentimplement.update(student);
		return studentUpdate;
	}
	@RequestMapping(value="/student/delete/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable(required=false) int id){
		
		
		studentimplement.delete(id);
		
		
	}
}
