package com.example.demo.student.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.bean.StudentAddressBean;
import com.example.demo.student.entity.Student;
import com.example.demo.student.entity.StudentAddress;
import com.example.demo.student.repository.StudentAddressRepository;
import com.example.demo.student.repository.StudentRepository;

@Transactional
@Service

public class StudentAddressImplementation implements StudentAdreesService {

	
	@Autowired
	StudentAddressRepository studentAddressRepository;
	
	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public Map<String, Object> saveStudentAddress(StudentAddressBean studentAddressBean) 
	{	
		Map<String, Object> response = new HashMap<String, Object>();
		response.put("method_name", "ADD STUDENT ADDRESS"); //ctl+shift+x
		response.put("response", "");
		
		Student studentObj=studentRepository.findOne(studentAddressBean.getStudentId());			
		if(studentObj != null)
		{
			//Save StudentAddress
			StudentAddress studentAddressObj=new StudentAddress();
			studentAddressObj.setFlatNo( studentAddressBean.getFlatNo());
			studentAddressObj.setStreetName(studentAddressBean.getStreetName());
			studentAddressObj.setCityName( studentAddressBean.getCityName());
			studentAddressObj.setStateName( studentAddressBean.getStateName());
			studentAddressObj.setStudentId(studentObj.getId());
			studentAddressObj.setPhoneNo(studentAddressBean.getPhoneNo());
			studentAddressObj.setStudentSalary(studentAddressBean.getStudentSalary());
			StudentAddress studentAddressRtrnObj = studentAddressRepository.save(studentAddressObj);
			
			//Prepare saved StudentAddress map
			Map<String, Object> studentAddressParams = new HashMap<String, Object>();
			studentAddressParams.put("stduentId", studentAddressRtrnObj.getStudentId());
			studentAddressParams.put("flatNo", studentAddressRtrnObj.getFlatNo());
			studentAddressParams.put("streetName", studentAddressRtrnObj.getStreetName());
			studentAddressParams.put("cityName", studentAddressRtrnObj.getCityName());
			studentAddressParams.put("stateName", studentAddressRtrnObj.getStateName());
			studentAddressParams.put("studentAddressId", studentAddressRtrnObj.getAddressId());
			studentAddressParams.put("StudentPhoneNO",studentAddressRtrnObj.getPhoneNo());
			studentAddressParams.put("studentSalary", studentAddressRtrnObj.getStudentSalary());

			//return response object
			 response.put("response_code", "0");
		     response.put("response_message", "Success");
		     //To pass studentAddressParams to response map
		     response.put("response", studentAddressParams);
			return response;
			
		} else {
			
			 response.put("response_code", "1");
		     response.put("response_message", "StudentId does not exist");
		     return response;
		     
		}	
	}

	@Override
	public Map<String,Object> updateStudentAddress(StudentAddress studentAddress) {
		// TODO Auto-generated method stub
		
		Map<String,Object> response=new HashMap<String,Object>();
		response.put("method","UPDATE STUEDNT ADDRESS" );
		response.put("response","");
		StudentAddress studentAddressObj=studentAddressRepository.findOne(studentAddress.getStudentId());
		if(studentAddressObj != null){
			 
			 studentAddressObj.setFlatNo( studentAddress.getFlatNo());
			 studentAddressObj.setCityName( studentAddress.getCityName());
			 studentAddressObj.setStateName( studentAddress.getStateName());
			 studentAddressObj.setPhoneNo(studentAddress.getPhoneNo());
			 studentAddressObj.setStudentSalary(studentAddress.getStudentSalary());
			 studentAddressObj=studentAddressRepository.save(studentAddressObj);
			 
			 //save updated student Address
			 Map<String,Object> studentAddressUpdateParams=new HashMap<String,Object>();
			 studentAddressUpdateParams.put("studentId",studentAddressObj.getStudentId());
			 studentAddressUpdateParams.put("AddressId",studentAddressObj.getAddressId());
			 studentAddressUpdateParams.put("setFaltNo",studentAddressObj.getFlatNo());
			 studentAddressUpdateParams.put("CityName",studentAddressObj.getCityName());
			 studentAddressUpdateParams.put("StateName",studentAddressObj.getStateName());
			 studentAddressUpdateParams.put("PhoneNo", studentAddressObj.getPhoneNo());
			 studentAddressUpdateParams.put("StudentSalary",studentAddressObj.getStudentSalary());
			 
			 response.put("response_code", "0");
		     response.put("response_message", "Success");
		     response.put("response",studentAddressUpdateParams);
		     return response;
		}
		else{
			response.put("response_code","1");
			response.put("response","Student Address id does not exist");
			return response;
		}
		
	}

	
	@Override
	public List< StudentAddress> getByStudentId(int studentId) {
		// TODO Auto-generated method stub
		List<StudentAddress> studentAddressGet=studentAddressRepository.findBystudentId(studentId);
		return  studentAddressGet;
	}

	@Override
	public List<StudentAddress> getAllStudentAddress() {
		// TODO Auto-generated method stub
		List<StudentAddress> studentAllAdddress=studentAddressRepository.findAll();
		return studentAllAdddress;
	}

	@Override
	public List<StudentAddress> getyCityName(String cityName) {
		// TODO Auto-generated method stub
		List<StudentAddress> studentAllByCity=studentAddressRepository.findByCityName(cityName);
		return studentAllByCity;
	}

	@Override
	public List<StudentAddress> getBystateName(String stateNamee) {
		// TODO Auto-generated method stub
		List<StudentAddress> studentAllByState=studentAddressRepository.findByStateName(stateNamee);
		return studentAllByState;
	}

	@Override
	public void delete(int studentId) {
		// TODO Auto-generated method stub
		StudentAddress AddressDelete=studentAddressRepository.findOne(studentId);
		if(AddressDelete  != null){
			studentAddressRepository.delete(studentId);		
			}
		
	}

	
}
