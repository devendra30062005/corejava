package com.rays.java8;

public class TesthelloByLambada {
	
	public static void main(String[] args) {
		
		Hello h = (a,b)->{
			
			int c = a+b;
			System.out.println("Sum="+ c);
		};
		
		h.sum(10, 20);
	}

}
