package superthisconstructor;

public class B  extends A
{
	String x =" child class ";
	
	public void m1() {
		System.out.println(x);// child 
		System.out.println(this.x); // child class
		System.out.println(super.s); // super class s 
	}
	
	
	

}
