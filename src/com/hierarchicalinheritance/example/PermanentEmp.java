package com.hierarchicalinheritance.example;

public class PermanentEmp  extends Employee{
	double hike =0.5;
	
	void incrementSalary()
	{
		System.out.println("The permanent Employee increment Salary is :"+(salary+(salary * hike)));
	}
	

}
