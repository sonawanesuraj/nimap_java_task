package com.exception.example;

public class MultipleCatchBlock {
	public static void main(String[] args) {
		try {
			int a[]= new int[10];
			a[5]=30/0;
			System.out.println("First print statement in try block");
			}
		catch(ArithmeticException e) {
			System.out.println("Message: ArithmeticException");
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Message: ArrayIndexOutOfBoundsException");
			
		}
		catch(Exception e) {
			System.out.println("Some other Exception");
			
		}
		System.out.println("Out of try-catch block");
	}

}
