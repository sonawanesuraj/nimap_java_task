package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.*;

public class MapExample1 {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, "Rahul");
		map.put(2, "Shubham");
		map.put(3,"Tanmay");
		
		//Converting to Set so that we can traverse
		 Set set=map.entrySet();  
		    Iterator itr=set.iterator();  
		    
		    while(itr.hasNext()) {
		    	
		    	Map.Entry entry =(Map.Entry)itr.next();
		    	System.out.println(entry.getKey()+" "+entry.getValue());
	}
}
}
