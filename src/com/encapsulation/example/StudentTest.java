package com.encapsulation.example;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setId(10);
		s1.setName("Suraj");
		s1.setAddress("Pune");
		
		System.out.println("Student Id:" +s1.getId());
		System.out.println("Student Name:" +s1.getName());
		System.out.println("Student Address:"+s1.getAddress());
	}

}
