package collectionpractice;

import java.util.TreeMap;

public class TreemapExample {
	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		tm.put(1, "One");
		tm.put(2, "Two");
		tm.put(3, "Three");
		tm.put(3, "Six");
		tm.put(5, "Four");
		tm.put(5, "Five");
		tm.put(6, null);
		tm.put(8, null);
		tm.put(8,null );
		System.out.println(tm);
		
	}

}
