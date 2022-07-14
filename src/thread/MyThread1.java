package thread;

public class MyThread1 {
	public static void main(String[] args) {
		ThreadSleepMethod t = new ThreadSleepMethod("My First Thread...");
		t.start();
		
		String str = t.getName();
		System.out.println(str);
	}
	

}
