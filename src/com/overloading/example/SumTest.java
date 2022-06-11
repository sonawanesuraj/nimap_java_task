package com.overloading.example;

public class SumTest {
	public static void main(String[] args) {
		Sum a1 = new Sum();
		System.out.println(a1.sum(10, 20));
		System.out.println(a1.sum(10 , 20, 30));
		System.out.println(a1.sum(10 ,20));
		
		
	}

}
