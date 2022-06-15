package com.exception.throwexample;

import java.util.Scanner;

public class Voting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		try {
		int age = sc.nextInt();
		if(age<18) {
			throw new InvalidAgeException("You are not eligible for voting");
		}
		else {
			System.out.println("You can vote successfully. ");
		}
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		System.out.println("Welcome");
	}

}
