package com.example.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.mapping.TeacherDetails;
import com.example.demo.mapping.TeacherService;
import com.example.demo.repository.TeacherRepository;

@Transactional
@Service
public class TeacherImplement implements TeacherService {

	
	@Autowired
	TeacherRepository teacherRepository;
	
	
	@Override
	public void addteacherDetails(TeacherDetails teacher) {
		// TODO Auto-generated method stub
		this.teacherRepository.save(teacher);
		System.out.println("saved successFully");
		return;
		
		
		
	}

}
