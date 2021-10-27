package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.StudentMarkBean;
import com.example.demo.student.entity.Student;
import com.example.demo.student.entity.StudentMark;
import com.example.demo.student.repository.StudentMarkRepository;
import com.example.demo.student.repository.StudentRepository;

@RestController
public class StudentMarkController {
	
	@Autowired
	StudentMarkRepository studentmarkrepository;
	
	@Autowired
	StudentRepository studentrepository;
	
	@RequestMapping(value="/student/mark/add",method=RequestMethod.POST)
	public StudentMark add(StudentMark studentmark, Student student){
	
		if(student != null)
		{
			Student studentObj=studentrepository.getOne(student.getId());
			if(student != null)
			{
				StudentMark studentMark1 = new StudentMark();
				studentMark1.setTamil(studentmark.getTamil());
				studentMark1.setEnglish(studentmark.getEnglish());
				studentMark1.setMaths(studentmark.getMaths());
				studentMark1.setTotal(studentmark.getTamil()+studentmark.getEnglish()+studentmark.getMaths());
				studentMark1.setTerm(studentmark.getTerm());
				studentMark1.setStudentId(studentObj.getId());
				StudentMark studentMark2 = studentmarkrepository.save(studentMark1);
				return studentMark2;
			}
		}
	
			return null;
		
		
					
	}
	
	@RequestMapping(value="/student/mark/add2",method=RequestMethod.POST)
	public StudentMark add(StudentMarkBean studentMarkBean){
	
		if(studentMarkBean != null)
		{
			Student studentObj=studentrepository.getOne(studentMarkBean.getId());
			if(studentObj != null)
			{
				StudentMark studentMark1 = new StudentMark();
				studentMark1.setTamil(studentMarkBean.getTamil());
				studentMark1.setEnglish(studentMarkBean.getEnglish());
				studentMark1.setMaths(studentMarkBean.getMaths());
				studentMark1.setTotal(studentMarkBean.getTamil()+studentMarkBean.getEnglish()+studentMarkBean.getMaths());
				studentMark1.setTerm(studentMarkBean.getTerm());
				studentMark1.setStudentId(studentObj.getId());
				StudentMark studentMark2 = studentmarkrepository.save(studentMark1);
				return studentMark2;
			}
		}
		else
		{
			return null;
		}
		return null;		
		
	}
	

}
