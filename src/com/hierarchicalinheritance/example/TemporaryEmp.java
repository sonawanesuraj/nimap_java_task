package com.hierarchicalinheritance.example;

public class TemporaryEmp extends Employee{
	
	double hike =0.35;
	
	void incrementSalary()
	{
		System.out.println("The permanent Employee increment Salary is :"+(salary+(salary * hike)));
	}

}
