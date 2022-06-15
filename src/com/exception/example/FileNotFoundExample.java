package com.exception.example;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileNotFoundExample {
	public static void main(String[] args) {
		PrintWriter pw;
		
		try {
			pw = new PrintWriter("abc.txt");
			pw.println("saved");
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("File saved successfully");
	}

}
