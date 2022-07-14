package com.collection.list;

import java.util.*;

public class Student {
	public static void main(String[] args) {
		LinkedList<Integer> al = new LinkedList<>();
		al.add(34);
		al.add(45);
		al.add(12);
		al.add(12);
		al.add(89);
		al.add(11);
		al.add(10);
		System.out.println(al.size());
		System.out.println(al);
		System.out.println("============= for each loop =============");
		
		for (int a : al)
		System.out.println(a);
		
		System.out.println("============= Iterator =============");
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			int aa = (int)itr.next();
			System.out.println(aa);
		}
		

		System.out.println("============= ListIterator Using hasNext()  =============");
		ListIterator ltr = al.listIterator();
		while(ltr.hasNext()) {
			int aa=(int)ltr.next();
			System.out.println(aa);
		}
		System.out.println("=========== ListIterator using hasPrevious() ============");
		while(ltr.hasPrevious()) {
			int aa =(int)ltr.previous();
			System.out.println(aa);
		}

	}
}
