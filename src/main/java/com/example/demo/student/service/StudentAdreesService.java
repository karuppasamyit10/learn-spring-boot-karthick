package com.example.demo.student.service;

import java.util.List;
import java.util.Map;

import com.example.demo.bean.StudentAddressBean;
import com.example.demo.student.entity.StudentAddress;



public interface StudentAdreesService {
	



	Map<String, Object>  saveStudentAddress(StudentAddressBean studentAddressBean);
 	Map<String,Object>   updateStudentAddress(StudentAddress studentAddress);
    List<StudentAddress> getByStudentId(int studentId);
	List<StudentAddress> getAllStudentAddress();
	List<StudentAddress> getyCityName(String cityName);
	List<StudentAddress> getBystateName(String stateNamee);
	void delete(int studenId);
	
	}



