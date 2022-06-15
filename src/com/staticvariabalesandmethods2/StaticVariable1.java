package com.staticvariabalesandmethods2;

public class StaticVariable1 {
	static int a=10;
	static int change() 
	{
		int a =20;
		return a;
		
	}
	
	public static void main(String[] args) {
		int changeValue =StaticVariable1.change();
		System.out.println(changeValue);
		
	}

}
