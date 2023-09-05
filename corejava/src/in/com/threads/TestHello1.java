package in.com.threads;

import com.rays.java8.Hello1;

public class TestHello1 {
	
	public static void main(String[] args) {
		
		Hello1 h = new Hello1() {
			
			public void sum() {
				
	System.out.println("sum method...!!!!");			
			}

		
			
		};
		
		h.sum();
	}

}
