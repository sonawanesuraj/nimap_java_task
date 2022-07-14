package collectionpractice;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionTest {
	public static void main(String[] args) {
		ArrayList <String> al = new ArrayList<String>();
		al.add("Suraj");
		al.add("Prajit");
		al.add("Kiran");
		al.add("Rushikesh");
		al.add("Rahul");
		
		System.out.println("Minimum Value: "+Collections.min(al));
		System.out.println("Maximum Value:"+Collections.max(al));
		
		System.out.println("Index of element Suraj is : "+Collections.binarySearch(al, "Suraj"));
		System.out.println("Index of element Akshay is : "+Collections.binarySearch(al, "Prajit"));

	}

}
