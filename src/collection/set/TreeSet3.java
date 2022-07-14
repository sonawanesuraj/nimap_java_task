package collection.set;

import java.util.TreeSet;

public class TreeSet3 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(10);
		set.add(55);
		set.add(5);
		set.add(48);
		set.add(33);
		System.out.println("Lowest  Value: "+set.pollFirst());
		System.out.println("Highest Value: "+set.pollLast());
	}

}
