package com.rays.java8;

import java.util.Arrays;

public class Testarray {
	
	public static void main(String[] args) {
		
		int[] arr = {10,5,1,6,8,11};
		
		Arrays.parallelSort(arr);
		
		for (int  i : arr) {
			 
			System.out.println(i);
	}

}
}
