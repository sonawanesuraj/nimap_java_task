package collectionpractice;

import java.util.HashMap;

public class Map {
	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("A", null);
		hm.put("B", "Akshay");
		hm.put("C","Prajit");
		hm.put("D", null);
		hm.put("E", "Roshan");
		hm.put("F", "Tanmay");
		hm.put("G", null);
		
		hm.remove("G");
		System.out.println(hm);
		System.out.println(hm.containsValue("Tanmay"));

		
		
	}

}
