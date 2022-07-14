package collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		set.add("Akshay");
		set.add("Suraj");
		set.add("Roshan");
		set.add("Akshay");
        System.out.println("Traversing element through Iterator in descending order");  
		Iterator itr = set.descendingIterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
	}

}
