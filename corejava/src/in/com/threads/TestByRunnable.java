package in.com.threads;

public class TestByRunnable {
	
	public static void main(String[] args) {
		
		ByRunnable r1 = new ByRunnable("krishna");
		
		ByRunnable r2 = new ByRunnable("shirsath");
		
		
		Thread t1 = new Thread(r1);
		
		Thread t2 = new Thread(r2);
		
		t1.start();
		
		t2.start();
	}

}
