package com.example.demo.test;

public class Student {
private String stuName;
private int stuNo;
private String stuDep;
public String getStuName() {
	return stuName;
}
public void setStuName(String stuName) {
	this.stuName = stuName;
}

public  int getStuNo() {
	return stuNo;
}
public void setStuNo(int stuNo) {
	this.stuNo = stuNo;
}
public String getStuDep() {
	return stuDep;
}
public void setStuDep(String stuDep) {
	this.stuDep = stuDep;
}
@Override
public String toString() {
	return "Student [stuName=" + stuName + ", stuNo=" + stuNo + ", stuDep=" + stuDep + "]";

}
}
