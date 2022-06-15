package com.constructor.overloading.example;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("Student Id is"+s1.studId);
		System.out.println("Student Name is"+s1.studName);
		System.out.println("Student Age is"+s1.studAge);
		
		Student s2 = new Student(11,"Prajit",24);
		System.out.println("Student Id is"+s2.getStudId());
		System.out.println("Student Name is"+s2.getStudName());
		System.out.println("Student Age is"+s2.getStudAge());
	}
}