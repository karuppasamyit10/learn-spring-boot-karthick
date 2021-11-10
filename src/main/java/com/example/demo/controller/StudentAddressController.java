package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.StudentAddressBean;
import com.example.demo.student.entity.StudentAddress;
import com.example.demo.student.service.StudentAddressImplementation;


@RestController
public class StudentAddressController {
	
	
	@Autowired
	StudentAddressImplementation studentAddressImplementation;
	
	@RequestMapping(value="/address/add",method=RequestMethod.POST)
	public Map<String, Object> addStudentAddress(StudentAddressBean studentAddressBean)
	{
		Map<String, Object> response = new HashMap<String, Object>();
		response.put("method_name", "ADD STUDENT ADDRESS"); //ctl+shift+x
		response.put("response", "");
		if(studentAddressBean.getStudentId()>0)
		{
			response= studentAddressImplementation.saveStudentAddress(studentAddressBean);
			return response;
		} 
		else 
		{
			 response.put("response_code", "1");
		     response.put("response_message", "Invalid studentId");
		     return response;
		}
	}
	
	
	@RequestMapping(value="/address/update",method=RequestMethod.PUT)
	public Map<String,Object> updateStudentAddress(StudentAddress studentAddress){
		
		Map<String,Object> response =new HashMap<String,Object>();
		response.put("method_name","UPDATE STUDENT ADDRESS");
		response.put("response","");	
		if(studentAddress.getStudentId() > 0){
			
			response= studentAddressImplementation.updateStudentAddress(studentAddress);
			return response;
		}
		else{
			
			response.put("response_code", "1");
			response.put("response_message","Inavlid AddressId");
			return response;
			
		}
		
	}
	
	@RequestMapping(value="address/get/{studentId}",method=RequestMethod.GET)
	public List<StudentAddress> getByStudentAddressId(@PathVariable int studentId){
		List<StudentAddress> getByStudentId= studentAddressImplementation.getByStudentId(studentId);
		return getByStudentId;
	}
}
