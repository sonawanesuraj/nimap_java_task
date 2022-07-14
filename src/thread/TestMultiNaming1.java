package thread;

public class TestMultiNaming1 extends Thread{
	public void run() {
		System.out.println("running.....");
		
	}
	public static void main(String[] args) {
		TestMultiNaming1 t1 = new TestMultiNaming1();
		TestMultiNaming1 t2 = new TestMultiNaming1();
		System.out.println("Name of t1: "+t1.getName());
		System.out.println("Name of t2:"+t2.getName());
		
		t1.run();
		t2.run();
		
		t1.setName("Suraj Sonawane");
		System.out.println("After Changing name of t1: "+t1.getName());  
		
	}

}
