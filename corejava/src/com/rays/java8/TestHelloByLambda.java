package com.rays.java8;

public class TestHelloByLambda {
	
	public static void main(String[] args) {
		
		Hello h = new Hello() {
			
			
		public void sum(int a, int b) {};
	};
	
	h.defMethod();
	
	Hello.staticMethod();

}
	
}
