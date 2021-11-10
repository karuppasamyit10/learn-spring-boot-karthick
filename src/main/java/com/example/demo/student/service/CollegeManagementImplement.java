package com.example.demo.student.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.application.CollegeManagementBean;
import com.example.demo.student.entity.Student;
import com.example.demo.student.repository.CollegeManagementRepository;
import com.example.demo.student.repository.StudentRepository;


@Transactional
@Service

public class CollegeManagementImplement implements CollegeManagementService{

	
	@Autowired
	CollegeManagementRepository collegeManagementRepository;
	
	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public Map<String, Object> managementFee(CollegeManagementBean collegeManagementBean) {
		// TODO Auto-generated method stub
		
		Map<String,Object> response=new HashMap<String,Object>();
		response.put("response_method","Add management fees");
		response.put("response","");
		Student studentObj=studentRepository.findOne(collegeManagementBean.getStudentId());
		if(studentObj != null){
			CollegeManagement collegeManagementObj=new CollegeManagement();
			collegeManagementObj.setCollegeFee(collegeManagementBean.getCollegeFee());
			collegeManagementObj.setLibraryFee(collegeManagementBean.getLibraryFee());
			collegeManagementObj.setStoreFee(collegeManagementBean.getStoreFee());
			collegeManagementObj.setTotal(collegeManagementBean.getCollegeFee()+collegeManagementBean.getLibraryFee()+collegeManagementBean.getStoreFee());
			collegeManagementObj.setStudentId(studentObj.getId());
			CollegeManagement collegeManagementRtrn=collegeManagementRepository.save(collegeManagementObj);
			// save the elements
			Map<String,Object> collegeManagementReturnParams=new HashMap<String,Object>();
			collegeManagementReturnParams.put("CollegeFess",collegeManagementRtrn.getCollegeFee());
			collegeManagementReturnParams.put("LibraryFees", collegeManagementRtrn.getLibraryFee());
			collegeManagementReturnParams.put("StoreFess",collegeManagementRtrn.getStoreFee());
			collegeManagementReturnParams.put("Total",collegeManagementRtrn.getTotal());
			collegeManagementReturnParams.put("studentId", collegeManagementRtrn.getStudentId());
			collegeManagementReturnParams.put("ManagementId",collegeManagementRtrn.getManagementId());
			
			response.put("response_code", "0");
			response.put("response_message","Success");
			response.put("respone",collegeManagementReturnParams);
			return response;
		}
		else{
			response.put("respinse_code","1");
			response.put("response","student does not exist");
			return response;
		}
		
	}

}
