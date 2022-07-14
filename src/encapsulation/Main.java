package encapsulation;

public class Main {
	public static void main(String[] args) {
		Car c1 = new Car("BMW","$30000","200kmph");
		System.out.println(" Name: "+c1.getName()+" Price: "+c1.getPrice() +" topSpeed: " +c1.getToSpeed());
		c1.setName("Fortuner");
		System.out.println(c1.getName());
		
		System.out.println("Ater Updation ");
		c1.setPrice("$50000");
		c1.setToSpeed("250kmph");
		System.out.println(" Name: "+c1.getName()+" Price: "+c1.getPrice()+" topSpeed: "+c1.getToSpeed());
	

		
}
}
