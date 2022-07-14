package collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeque2 {
	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();
		deque.offer("Arvind");
		deque.offer("Vimal");
		deque.offer("Mukul");
		deque.offerFirst("jai");
		
		System.out.println("After offerFirst Traversal...");  
	    for(String s:deque){  
	        System.out.println(s);  
	    }  
	    
	    deque.pollLast();
	    System.out.println("After pollLast() Traversal...");  
	    
	    for(String s:deque) {
	    	System.out.println(s);
	    }


	}

}
