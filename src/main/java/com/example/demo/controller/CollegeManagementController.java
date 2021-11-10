package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.application.CollegeManagementBean;
import com.example.demo.student.service.CollegeManagementImplement;

@RestController
public class CollegeManagementController {
	
	@Autowired
	CollegeManagementImplement collegeManagementImplement;

	@RequestMapping(value="/fees/add",method=RequestMethod.POST)
	public Map<String,Object> addManagementFees(CollegeManagementBean collegeManagementBean){
		Map<String,Object> response=new HashMap<String,Object>();
		response.put("response_method","ADD STUDENT FEES");
		response.put("response","");
		if(collegeManagementBean.getStudentId()>0)
		{
			response= collegeManagementImplement.managementFee(collegeManagementBean);
			return response;
		}
		else{
			 response.put("response_code", "1");
		     response.put("response_message", "Invalid studentId");
		     return response;
		}
	}
	
	
}
