package com.example.demo.student.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Table(name="student_marks")
@Entity

public class StudentMark {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="student_mark_id")
	private int studentMarkId;
	
	@Column(name="tamil_subject")
	private int tamil;
	
	@Column(name="english_subject")
	private int english;
	
	@Column(name="maths_subject")
	private int maths;
	
	@Column(name="total")
	private int total;
	
	@Column(name="exam_term")
	private String term;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="student_id")
	private Student student;
	

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
 
	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public int getTamil() {
		return tamil;
	}

	public void setTamil(int tamil) {
		this.tamil = tamil;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getStudentMarkId() {
		return studentMarkId;
	}

	public void setStudentMarkId(int studentMarkId) {
		this.studentMarkId = studentMarkId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}
