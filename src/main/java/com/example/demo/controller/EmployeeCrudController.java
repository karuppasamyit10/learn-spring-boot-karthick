package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.EmployeImpl;
import com.example.demo.entity.Employe;

@RestController
public class EmployeeCrudController {

	@Autowired
	EmployeImpl employeImpl;
//	
//	@RequestMapping(value="/employe/add",method= RequestMethod.POST)
//	public Map<String, Object> addEmployee(String name, int no, int salary){
//		
//		return params;
//	}
	
	@RequestMapping(value="/employe/add",method= RequestMethod.POST)
	public Employe addEmployee(Employe employe){
		Employe emp = employeImpl.save(employe);
		return emp;
	}
	
	
	
	@RequestMapping(value="/employe/get/{id}",method= RequestMethod.GET)
	public Employe getEmploye(@PathVariable(required=false) int id)
	{
		if(id == 0){
			return null;		
		}
		Employe emp = employeImpl.get(id);
		return emp;
	}
	
	@RequestMapping(value="/employe/getAll",method= RequestMethod.GET)
	public List<Employe> getAllEmploye()
	{
		return employeImpl.getAll();
	}
	
	@RequestMapping(value="/employe/getAllByName",method= RequestMethod.GET)
	public List<Employe> getAllEmployeByName(String name)
	{
		return employeImpl.getAllByEmpName(name);
	}
	
	@RequestMapping(value="/employe/update",method= RequestMethod.PUT)
	public Employe putEmploye(Employe employe)
	{
		if(employe.getId() == 0){
			return null;		
		}
		Employe emp = employeImpl.update(employe);
		return emp;
	}
	
	@RequestMapping(value="/employe/delete/{id}",method= RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable(required=false) int id)
	{
		employeImpl.delete(id);	
	}
}	
	

