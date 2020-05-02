package com.core.tests;

import java.util.Arrays;

public class HowWillYouCompare {
	public static void main(String a[]) {
		
	}
	
	class Comparator{ 
		public boolean compare(int a, int b)    {  
			if (a == b)        { 
				return true;  
			} else    
				return false;
		} 
		
		public boolean compare(String a, String b)    {
			if (a.equals(b))        {  
				return true;     
			}   
			else 
				return false;   
		}    
		public boolean compare(int[] a, int[] b)    { 
			if (Arrays.equals(a,b))        {
				return true;  
			}  else   
				return false;  
		}
	}
	/**
	 * 
	 */
	
	class Comparator1{
		public boolean compare(int number1, int number2)    {     
			if (number1 == number2)        
				return true;      
			else           
				return false;   
		}   
		
		public boolean compare(String string1, String string2)    {     
			if (string1.equals(string2))         
				return true;      
			else        
				return false;  
		}   
		
		public boolean compare(int[] array1, int[] array2)    {   
			if (Arrays.equals(array1, array2))         
				return true;      
			else           
				return false;   
		} 
	}
	
}
