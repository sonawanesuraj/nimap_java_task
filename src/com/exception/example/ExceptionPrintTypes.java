package com.exception.example;

public class ExceptionPrintTypes {
	public static void main(String[] args) {
		try {
			
			int a=100, b=0, c;
			c = a/b;
			System.out.println(c);
			
		}catch(ArithmeticException e) {
			System.out.println(e); // print exception name and description
			
			System.out.println(e.toString());//print exception name and description
			
			System.out.println(e.getMessage()); // only print the msg 
			
		}
	}

}
