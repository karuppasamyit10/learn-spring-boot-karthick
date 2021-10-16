package com.example.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employe;
import com.example.demo.repository.EmployeRepository;

@Transactional
@Service
public class EmployeImpl implements EmployeService {

	@Autowired
	EmployeRepository employeRepository;
	
	//Save Employe 
	@Override
	public Employe save(Employe employe) {
		// TODO Auto-generated method stub
		Employe employeeObj = new Employe();
		employeeObj.setEmpName(employe.getEmpName());
		employeeObj.setEmpNo(employe.getEmpNo());
		employeeObj.setEmpSalary(employe.getEmpSalary());
		Employe employeRtrn = employeRepository.save(employeeObj);		
		return employeRtrn;
	}

	@Override
	public Employe update(Employe employe) {
		// TODO Auto-generated method stub
		Employe empUpdate =employeRepository.findOne(employe.getId());
		if(empUpdate!=null){
			empUpdate.setEmpName(employe.getEmpName());
			empUpdate.setEmpNo(employe.getEmpNo());
			empUpdate.setEmpSalary(employe.getEmpSalary());
			Employe emp = employeRepository.save(empUpdate);
			return emp;
		} else {
			return null;
		}
	}

	@Override
	public Employe get(int id) {
		// TODO Auto-generated method stub
		Employe emp =employeRepository.findOne(id);
		return emp;
	}

	@Override
	public List<Employe> getAll() {
		// TODO Auto-generated method stub
		List<Employe> emp = employeRepository.findAll();
		return emp;
	}
	
	@Override
	public List<Employe> getAllByEmpName(String name) {
		// TODO Auto-generated method stub
		List<Employe> emp = employeRepository.findByEmpNameContains(name);
		return emp;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Employe empDelete =employeRepository.findOne(id);
		if(empDelete != null){
			employeRepository.delete(empDelete);
//			employeRepository.delete(id);
		}		
	}

}
