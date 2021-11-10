package com.example.demo.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="student_Address")
@Entity

public class StudentAddress {
	
	@Column(name="address_id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addressId;
	
	@Column(name="Flat_No")
	private int flatNo;
	
	@Column(name="street_name")
	private String streetName;
	
	@Column(name="city_name")
	private String cityName;
	
	@Column(name="state_name")
	private String stateName;
	
	@Column(name="student_id")
	private int studentId;
	
	@Column(name="phone_num")
	private long phoneNo;
	
	@Column(name="student_salary")
	private double studentSalary;
	

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public int getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public double getStudentSalary() {
		return studentSalary;
	}

	public void setStudentSalary(double studentSalary) {
		this.studentSalary = studentSalary;
	}
	

	

}
