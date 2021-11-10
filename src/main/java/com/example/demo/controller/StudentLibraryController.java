package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.StudentlibraryBean;
import com.example.demo.student.service.StudentLibraryImplement;

@RestController
public class StudentLibraryController {
	
	@Autowired
	StudentLibraryImplement studentLibraryImplement;
	
	@RequestMapping(value="/library/add",method=RequestMethod.POST)
	public Map<String, Object> addStudentLibrary(StudentlibraryBean studentlibraryBean)
	{
		Map<String, Object> response = new HashMap<String, Object>();
		response.put("method_name", "ADD STUDENT ADDRESS"); 
		response.put("response", "");
		if(studentlibraryBean.getStudentId()>0)
		{
			response= studentLibraryImplement.addStudentlibrary(studentlibraryBean);
			return response;
		} 
		else 
		{
			 response.put("response_code", "1");
		     response.put("response_message", "Invalid studentId");
		     return response;
		}
	} 

}
