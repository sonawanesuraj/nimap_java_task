package collection.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		PriorityQueue <String> pq = new PriorityQueue<String>();
		pq.add("Amit");
		pq.add("Vijay");
		pq.add("Karan");
		pq.add("Rahul");
		pq.add("Prajit");
		pq.add("Nikhil");
		System.out.println("head: "+pq.element());
		System.out.println("head: "+pq.peek());
		System.out.println("Iterating the queue elements: ");
		Iterator itr = pq.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
			pq.remove();
			pq.poll();
			System.out.println("After removing two elements: ");
			Iterator itr2 = pq.iterator();
			while(itr2.hasNext()) {
				System.out.println(itr2.next());
			}

		}
	}


