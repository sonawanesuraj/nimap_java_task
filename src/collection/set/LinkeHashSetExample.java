package collection.set;

import java.util.LinkedHashSet;

public class LinkeHashSetExample {
	public static void main(String[] args) {
		LinkedHashSet<Book> lhs = new LinkedHashSet<>();
		 Book b1 = new Book(101,"Let us C","Yashwant Kanetkar","BPB",10);
		 Book b2 = new Book(102,"Operating System","Galvin","Wiley",6);
		 Book b3 = new Book(103,"Data Communications & Networking","Forouzan","Mc Graw Hill",8);
				 
		 lhs.add(b1);
		 lhs.add(b2);
		 lhs.add(b3);
		 
		 for(Book b:lhs) {
			System.out.println (b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
		 }
	}

}
