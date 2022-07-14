package collectionpractice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterateArrayList {
	public static void main(String[] args) {
		List<String> courses = Arrays.asList("C", "C++", "Java", "Spring", "Hibernate");

		// Basic for loop
		System.out.println("========Basic for loop ========");
		for (int i = 0; i < courses.size(); i++) {
			System.out.println(courses.get(i));
		}
		System.out.println("========Enhanced for each loop ========");

		// Enhanced for each loop
		for (String a : courses) {
			System.out.println(a);
		}

		// basic loop with Iterator
		System.out.println("======== basic loop with Iterator ========");
		for (Iterator iterator = courses.iterator(); iterator.hasNext();) {
			String course = (String) iterator.next();
			System.out.println(course);
		}

		// Iterator with while loop
		System.out.println("======== Iterator with while loop ========");
		Iterator itr = courses.iterator();
		while (itr.hasNext()) {
			String course = (String) itr.next();
			System.out.println(course);
		}

		// java 8 stream + lambda example
		System.out.println("======== java 8 stream + lambda example ========");
		courses.stream().forEach(course -> System.out.println(course));

	}

}
