package com.example.demo.student.service;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="college_management")
public class CollegeManagement { 
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int managementId;
	
	@Column
	private double collegeFee;
	
	@Column
	private double storeFee;
	
	@Column
	private double LibraryFee;
	
	@Column
	private double total;
	
	@Column
	private int studentId;

	public int getManagementId() {
		return managementId;
	}

	public void setManagementId(int managementId) {
		this.managementId = managementId;
	}

	public double getCollegeFee() {
		return collegeFee;
	}

	public void setCollegeFee(double collegeFee) {
		this.collegeFee = collegeFee;
	}

	public double getStoreFee() {
		return storeFee;
	}

	public void setStoreFee(double storeFee) {
		this.storeFee = storeFee;
	}

	public double getLibraryFee() {
		return LibraryFee;
	}

	public void setLibraryFee(double libraryFee) {
		LibraryFee = libraryFee;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	
	

}
