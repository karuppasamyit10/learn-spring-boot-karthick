package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;

@RestController
public class EmployeeListController {

	static List<Employee> employeeList = new ArrayList<>();
	
	
	@RequestMapping(value="/employee/add1",method= RequestMethod.POST)
	public Map<String, Object> addEmployee(String name, int no, int salary){
		Employee employee = new Employee();
		employee.setEmpName(name);
		employee.setEmpNo(no);
		employee.setEmpSalary (salary);
		employeeList.add(employee);
		Map<String, Object> params = new  HashMap<>();
		params.put("name", employee.getEmpName());
		params.put("id", employee.getEmpNo());
		params.put("salary", employee.getEmpName());
		return params;
	}
	
	@RequestMapping(value="/employee/add2",method= RequestMethod.POST)
	public Employee addEmployee(Employee employee){
		employeeList.add(employee);
		return employee;
	}
	
	
	
	@RequestMapping(value="/employee/get/{no}",method= RequestMethod.GET)
	public List<Employee> getEmployee(@PathVariable(required=false) int no)
	{
		if(no == 0){
			return employeeList;		
		}
		for(Employee employee : employeeList){
			if(employee.getEmpNo() ==no)
			{
				List<Employee> employeeLists = new ArrayList<>();
				employeeLists.add(employee);
				return employeeLists;
			}
		}
		return new ArrayList<Employee>();
	}
	
	@RequestMapping(value="/employee/update",method= RequestMethod.PUT)
	public List<Employee> putEmployee(Employee employee)
	{
		if(employee.getEmpNo() == 0){
			return new ArrayList<Employee>();		
		}
		for(Employee employee1 : employeeList){
			if(employee1.getEmpNo() == employee.getEmpNo())
			{
				employee1.setEmpName(employee.getEmpName());
				return employeeList;		
			}
		}
		return new ArrayList<Employee>();
	}
	
	@RequestMapping(value="/employee/delete/{no}",method= RequestMethod.DELETE)
	public List<Employee> deleteEmployee(@PathVariable(required=false) int no)
	{
		if(no == 0){
			return employeeList;		
		}
		for(Employee employee : employeeList){
			if(employee.getEmpNo() ==no)
			{
				employeeList.remove(employee);
				return employeeList;
			}
		}
		return new ArrayList<Employee>();
		
	
	}
	
	}	
	

