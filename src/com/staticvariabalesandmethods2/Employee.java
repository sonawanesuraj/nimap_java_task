package com.staticvariabalesandmethods2;

public class Employee {
	static int id =10;
	String name;
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		
		int x = emp.id; //call static variable using object reference
		
		System.out.println(x); 
		System.out.println(Employee.id); // Now call static variable using class name 
		
		
	}

}
