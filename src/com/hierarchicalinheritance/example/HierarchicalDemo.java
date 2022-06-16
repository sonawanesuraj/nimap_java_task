package com.hierarchicalinheritance.example;

public class HierarchicalDemo {
	public static void main(String[] args) {
		PermanentEmp p = new PermanentEmp();
		TemporaryEmp t = new TemporaryEmp();
		p.dispSalary();
		p.incrementSalary();
		t.dispSalary();
		t.incrementSalary();
	}

}
