package com.holesInNumber;

public class HolesInNumber {

public static void main(String a[]) {
		
	}
	
	 static int hole[] = { 1, 0, 0, 0, 1, 0, 1, 0, 2, 1 };  
	 public static int countHoles(int number) {   
		 int holes = 0;      
		 while (number > 0)      { 
			 int d = number % 10;   
			 holes = holes + hole[d];    
			 number = number / 10;     
		 }   
		 return holes;  
	 } 
	 
	 /**
	  * 
	  * @param number
	  * @return
	  */
	 public static int countHole(int number) {
		 // Write your code here    
		 int count = 0;  
		 int[] hole = {1,0,0,0,1,0,1,0,2,1}; 
		 while(number > 0){    
			 int num = number % 10; 
			 count += hole[num];  
			 number /= 10;     
		 }      
		 return count;    
	 }
	 
	 /**
	  * 
	  */
	 public static int countHoles2(int number) {
		 String holes = Integer.toString(number);   
		 int count = 0;     
		 for(int i =0; i<=holes.length()-1;i++)        {  
			 if(holes.charAt(i)=='0'||holes.charAt(i)=='4'||holes.charAt(i)=='6'||holes.charAt(i)=='9')            {     
				 count = count + 1;          
			 }         
			 else if(holes.charAt(i)=='8')            {  
				 count = count + 2;      
			 }     
		 }      
		 return count;  
	 } 
}
