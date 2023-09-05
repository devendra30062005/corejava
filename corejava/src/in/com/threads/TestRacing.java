package in.com.threads;

public class TestRacing {
	
	public static void main(String[] args) {
		
		Racing t1 = new Racing("krishna");
		
		Racing t2 = new Racing("sharma");
		
		t1.start();
		
		//t2.start();
	}

}
