package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample2 {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(101, "Pradip");
		map.put(102, "Sagar");
		map.put(103, "Mayur");
		map.put(104, "Prashant");
		map.put(105, "Sagar");
		map.put(101, "Pradip");
		for(Map.Entry<Integer, String>entry:map.entrySet()){
			System.out.println("Key : "+entry.getKey()+" value : "+entry.getValue());
		}
		
		
	}

}
