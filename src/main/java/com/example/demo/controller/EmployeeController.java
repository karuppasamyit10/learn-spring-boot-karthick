package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;

@RestController
public class EmployeeController {

	static List<Employee> employeeList = new ArrayList<>();
	
	@RequestMapping(value="/employee/add1",method= RequestMethod.POST)
	public Employee addEmployee(String name, int no, int salary){
		Employee employee = new Employee();
		employee.setEmpName(name);
		employee.setEmpNo(no);
		employee.setEmpSalary(salary);
		employeeList.add(employee);
		return employee;
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
	
	
	
	
	
}
