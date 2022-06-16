package inheritance.example1;

// Scenario 3
// Asigns Sub class to Super class 

public class ABTest3 {
	public static void main(String[] args) {
		A a = new B();
		System.out.println(a.a);
		System.out.println(a.b);
	//	System.out.println(a.c); // Error c is not exists in A
		a.m1();
		a.m2();
	//	a.m3();  //  Error m3 of A does not Exists in A
		
	}

}
