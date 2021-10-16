package com.example.demo.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.example.demo.test.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {
	
	
	private static final String List = null;
	Map<String,Object>  param = new  HashMap<>();
	@PostMapping("/student/add") 
		 public  Map<String, Object> add (String name,int id,String dep){
		Student student=new Student();
		
		param.put("name",student.getStuName());
		param.put("id",student.getStuNo());
		param.put("dep",student.getStuDep());
		return param;
		
	}
	@GetMapping("/student/get/{id}")
	public Map<String,Object> getStudent(@PathVariable(required=false)int id){
	
		if(id==0){
			return param;
		}
		return param;
		
		
		
		
		
		
	}
	

}
