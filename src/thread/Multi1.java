package thread;

// Thread example by implementing runnable interface 
public class Multi1  implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread is Running....");
		
	}
	public static void main(String[] args) {
		Multi1 m1 = new Multi1();
		ThreadSleepMethod t1 = new ThreadSleepMethod(m1);
		t1.start();
		
	}

}
