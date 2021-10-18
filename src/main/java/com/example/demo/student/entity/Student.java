package com.example.demo.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String stuName;
	@Column
	private int stuRollNo;
	@Column
	private String stuDepName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getStuRollNo() {
		return stuRollNo;
	}
	public void setStuRollNo(int stuRollNo) {
		this.stuRollNo = stuRollNo;
	}
	public String getStuDepName() {
		return stuDepName;
	}
	public void setStuDepName(String stuDepName) {
		this.stuDepName = stuDepName;
	}

}
