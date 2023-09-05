package in.com.threads;

public class TestWithThreads {
	
	public static void main(String[] args) {
		
		
		WithThreads t1 =new WithThreads("uday");
		
		t1.setPriority(1);
		  
		WithThreads t2 =new WithThreads("dabi");
		
		t2.setPriority(10);
		
		t1.start();
		
		t2.start();
	}

}
