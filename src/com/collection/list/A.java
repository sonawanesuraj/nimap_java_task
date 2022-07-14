package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class A {
	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<>();
		al.add(100);
		al.add(null);
		al.add(85);
		al.add(55);
		al.add(25);
		al.add(33);
		al.add(55);
		al.add(null);
		al.add(25);
		System.out.println(al.size());
		System.out.println(al);
		System.out.println("============= for each loop =============");
		
		//for (int a : al)
		//System.out.println(a);
		 
		System.out.println("============= Iterator =============");
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			Object aa = itr.next();
			System.out.println(aa);
		}
		

		System.out.println("============= ListIterator Using hasNext()  =============");
		ListIterator ltr = al.listIterator();
		while(ltr.hasNext()) {
			Object aa= ltr.next();
			System.out.println(aa);
		}
		System.out.println("=========== ListIterator using hasPrevious() ============");
		while(ltr.hasPrevious()) {
			Object aa =ltr.previous();
			System.out.println(aa);
		}


	}
	
	

}
