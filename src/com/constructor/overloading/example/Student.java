package com.constructor.overloading.example;

public class Student {
	int studId;
	String studName;
	int studAge;
	
	// default constructor
	Student(){
		studId=100;
		studName="Suraj";
		studAge=24;
		
	}
  // parameterized constructor
	public Student(int num1, String str, int num2) {
		studId = num1;
		studName = str;
		studAge = num2;
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getStudAge() {
		return studAge;
	}
	public void setStudAge(int studAge) {
		this.studAge = studAge;
	}
	
	
	
	
	
	

}
