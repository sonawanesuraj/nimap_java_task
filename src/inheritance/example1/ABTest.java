package inheritance.example1;

// scenario first
public class ABTest {
	public static void main(String[] args) {
		A a = new A(); //Super class object a is only eligible for class A
		System.out.println(a.a);
		System.out.println(a.b);
		
	//	System.out.println(a.c); //Error c does not exist in a;
		
		a.m1();
		a.m2(); 
	//	a.m3(); // m3 does not exist in class A
	}

}
