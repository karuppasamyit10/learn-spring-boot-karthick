package com.example.demo.student.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
@Table(name="students")
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
	
	@JsonFormat(pattern="yyyy-MM-dd",shape=Shape.STRING)
	@Column
	private Date createdDate;
	
	
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

	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
}
