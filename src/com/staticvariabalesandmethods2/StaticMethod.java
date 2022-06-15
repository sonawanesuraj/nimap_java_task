package com.staticvariabalesandmethods2;

public class StaticMethod {
	
	static int x=20;
	int y=30;
	
	void display() {
		System.out.println(x);
		System.out.println(y);
	}
	
	static void show() {
		System.out.println(x);
		
	//	System.out.println(y); // compile time error because instance variable cannot access inside S.M. 
	}
	
	public static void main(String[] args) {
		StaticMethod m1 = new StaticMethod();
		m1.display();
		
		show();
	}
	

}
