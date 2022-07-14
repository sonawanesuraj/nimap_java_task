package thread;

public class MyThread2 implements Runnable {

	@Override
	public void run() {
		System.out.println(" Now Thread is running.....");
	}

	public static void main(String[] args) {
		Runnable r = new MyThread2();
		ThreadSleepMethod t1 = new ThreadSleepMethod(r, " My New Thread");
		t1.start();
		
		String str = t1.getName();
		System.out.println(str);
	}

}
