package collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet<String > al = new TreeSet<String>();
		al.add("Om");
		al.add("Prajit");
		al.add("Roshan");
		al.add("Sanket");
		al.add("Om");
		al.add("Suraj");
		al.add("Ashwin");
		al.add("Nakul");
		al.add("Roshan");
		al.add("Sanket");
		
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			String name = (String)itr.next();
			System.out.println(name);
		}
		
	}

}
