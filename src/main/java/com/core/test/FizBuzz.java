package com.core.test;

public class FizBuzz {
	public static void main(String[] a) {
		FizBuzz(15);
	}
	
	public static void FizBuzz(int input) {
		
		for(int i = 1 ; i <= input; i ++ ) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0  ) {
				System.out.println("Fizz");
			} else if(i % 5 == 0 ) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
		
	}
}
