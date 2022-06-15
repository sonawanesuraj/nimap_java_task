package com.exception.example1;

public class TestCustomeException1 {
	static void validate(int age) throws InvalidAgeException {

		if (age < 18) {
			throw new InvalidAgeException("age is not valid to vote");
		} else {
			System.out.println("welcome to vote");

		}

	}

	public static void main(String[] args) {
		try {
			validate(13);

		} catch (InvalidAgeException ex) {
			System.out.println("caught the Exception");

			System.out.println("Exception occured:" + ex);
		}
		System.out.println("rest the code...");
	}

}
