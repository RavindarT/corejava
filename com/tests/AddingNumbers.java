package com.core.tests;

public class AddingNumbers {

	public static void main(String a[]) {
		System.out.println(addNumbers(2, (float) 2.4));
	}
	
	public static int addNumbers(float a, float b) { 
		// Write your code here 
		return (int) (a+b);  
	} 
	
	public static int addNum(float a, float b) {   
		float c = 0;  
		c = a + b;   
		return (int)((Math.floor(c)));    
	} 
	
}
