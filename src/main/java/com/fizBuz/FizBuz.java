package com.fizBuz;

public class FizBuz {
	public static void main(String a[]) {
		
	}

	public static void fizzBuzz(int m) { 
		// Write your code here 
		{    // Write your code here  
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
}
