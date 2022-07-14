package collectionpractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkHasMap {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
		lhm.put(1, "Hii..");
		lhm.put(2, null);
		lhm.put(3, "Hello");
		lhm.put(4, "Hii..");
		lhm.put(4, "Welcome");
		lhm.put(5, null);
		lhm.put(6, null);
		
	
		System.out.println(lhm);
		
		// getting the value of key one 
		System.out.println("getting the value of key Five: "+lhm.get(5));
		
		// size of linkedhashmap elements
		System.out.println("Size of LinkedHashMap Elements: "+lhm.size());
		
		// 
		System.out.println(lhm.isEmpty());
		
		// delete element one
		System.out.println("Delete element one: "+lhm.remove(1));
		System.out.println(lhm);
		
		//Update Element 
		lhm.put(3, "Well-Come");
		System.out.println("Updated Map: "+lhm);
		
		// Iterator 
		for(Map.Entry<Integer,String>mapElement :lhm.entrySet()) {
			Integer key = mapElement.getKey();
			String value = mapElement.getValue();
			System.out.println(key+" : "+value);
			
		}
		
	}
	// Iteratring  through LinkedHashMap
	
	


}
