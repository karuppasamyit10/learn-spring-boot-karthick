package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Employe;

public interface EmployeService {

	Employe save(Employe employe);
	Employe update(Employe employe);
	Employe get(int id);
	List<Employe> getAll();
	List<Employe> getAllByEmpName(String name);
	void delete(int id);
	
	
}
