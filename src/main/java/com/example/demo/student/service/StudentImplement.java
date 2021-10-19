package com.example.demo.student.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.student.entity.Student;
import com.example.demo.student.repository.StudentRepository;

import java.util.List;

@Transactional
@Service
public class StudentImplement implements StudentService {
   
	@Autowired
	StudentRepository studentrepository;
	
	@Override
	public Student save(Student student) {
		Student studentObj=new Student();
		studentObj.setStuName( student.getStuName());
		studentObj.setStuRollNo(student.getStuRollNo());
		studentObj.setStuDepName(student.getStuDepName());
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
	public Student get(int id) {
		// TODO Auto-generated method stub
		Student studentGet=studentrepository.findOne(id);
		return studentGet;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Student stuDelete=studentrepository.findOne(id);
		if(stuDelete != null)
			studentrepository.delete(id);
			
		
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		List<Student> studentGetAll= studentrepository.findAllStudent();
		return studentGetAll;
	}

	@Override
	public List<Student> getAllByName(String name){
		// TODO Auto-generated method stub
		List<Student> stuGetByName= studentrepository.findByStuName(name);
		return stuGetByName;
	}

	
	

}
