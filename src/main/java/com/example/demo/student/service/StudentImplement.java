package com.example.demo.student.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import com.example.demo.student.entity.Student;
import com.example.demo.student.repository.StudentRepository;

import java.util.Date;
import java.util.List;

@Transactional
@Service
public class StudentImplement implements StudentService {
   
	@Autowired
	StudentRepository studentrepository;
	
	@Override
	public Student save(Student student) 
	{
		Student studentObj=new Student();
		studentObj.setStuName( student.getStuName());
		studentObj.setStuRollNo(student.getStuRollNo());
		studentObj.setStuDepName(student.getStuDepName());
		studentObj.setCreatedDate(new Date());
		Student stu=studentrepository.save(studentObj);
		return stu;
		
	}

	@Override
	public Student update(Student student) {
		Student stuUpdate=studentrepository.findOne(student.getId());
		if(stuUpdate != null){
			stuUpdate.setStuName(student.getStuName());
			stuUpdate.setStuRollNo(student.getStuRollNo());
			stuUpdate.setStuDepName(student.getStuDepName());
			Student stu=studentrepository.save(stuUpdate);
			return stu;
		}
		else{
				
		return null;
		}
		
	}

	@Override
	public Student get(int id) 
	{
		// TODO Auto-generated method stub
		Student studentGet=studentrepository.findOne(id);
		return studentGet;
	}

	@Override
	public void delete(int id)
	{
		// TODO Auto-generated method stub
		Student stuDelete=studentrepository.findOne(id);
		if(stuDelete != null)
			studentrepository.delete(id);
			
		
	}

	@Override
	public List<Student> getAllStudent() 
	{
		// TODO Auto-generated method stub
		List<Student> studentGetAll= studentrepository.findAllStudent();
		return studentGetAll;
	}

	@Override
	public List<Student> getByStuName(String stuName)
	{
		// TODO Auto-generated method stub
		List<Student> stuGetByName= studentrepository.findByStuName(stuName);
		return stuGetByName;
	}

	public List<Student> getByStuNameAndStuDepName(String StuName,String StuDepName)
	{
		
		List<Student> stuGetByNameAndDep=studentrepository.findByStuNameAndStuDepName(StuName, StuDepName);
		return stuGetByNameAndDep;
		
	}
	
	
	public List<Student> getByStuNameOrStuDepName(String StuName,String StuDepName)
	{
		
		List<Student> stuGetByNameOrDep=studentrepository.findByStuNameOrStuDepName(StuName, StuDepName);
		return stuGetByNameOrDep;

	}

	@Override
	public List<Student> getByStuDepName(String stuDepName) 
	{
		// TODO Auto-generated method stub
		List<Student> stuGetByDepName=studentrepository.findByStuDepName(stuDepName);
		return stuGetByDepName;
	}
	


}
