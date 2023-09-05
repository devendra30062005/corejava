package in.com.threads;

public class TestWithoutThreads {
	
	public static void main(String[] args) {
		
		WithoutThreads t1 = new WithoutThreads("ganesh");
		 
		 WithoutThreads t2 = new WithoutThreads("shi");
		 
		 t2.run();
		 t1.run();
		
	}

}
