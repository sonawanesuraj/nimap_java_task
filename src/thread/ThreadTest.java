package thread;

public class ThreadTest extends Thread {
	public void run() {
		System.out.println("Child thread....");
		System.out.println("child thread priority: "+Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) {
		System.out.println("Main thread priority: "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println("New thread priority: "+Thread.currentThread().getPriority());
		System.out.println("Max Priority: "+Thread.currentThread().MAX_PRIORITY);
		System.out.println("Min Priority: "+Thread.currentThread().MIN_PRIORITY);
		
		ThreadTest t1 = new ThreadTest();
		t1.start();
		
		
	}

}
