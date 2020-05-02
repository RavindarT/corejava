package com.core.tests;

public class FizBuz {
	public static void main(String a[]) {
		
	}

	public static void fizzBuzz(int m) { 
		
		for(int k = 1; k <= m; k++)   {  
			if(k % 15 == 0)   
				System.out.println("FizzBuzz"); 
			else if(k % 3 == 0)    
				System.out.println("Fizz");     
			else if(k % 5 == 0)     
				System.out.println("Buzz");     
			else 
				System.out.println(k);      
		}            
		    
		
	}
}
