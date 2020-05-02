package com.core.tests;

public class CoderFriends {
	
	
	  public static String winner(String erica, String bob) { 
		  // Write your code here     
//		  int countE = 0;  
//		  int countB = 0;  
//		  char[] ericaCharArray = erica.toCharArray();  
//		  char[] bobCharArray = bob.toCharArray();    
//		  for(char c : ericaCharArray)          
//			  countE += difficulty(c);    
//		  for(char c : bobCharArray)  
//			  countB += difficulty(c);    
//		  if(countE > countB)        
//			  return "Erica";     
//		  else if(countE == countB)   
//			  return "Tie";      
//		  return "Bob";   
//		  
		  
		
		
		 int a =  convertToValue(erica);
		 int b =  convertToValue(bob);
		
		if (a == b ) {
			return "Tie";
		} else if (a > b ) {
			return "erica";
		} else {
			return "bob";
		}
		
	  }
	  
	  public static int convertToValue(String str) {
		  int sum = 0;
		  int  strLength =  str.length();
			for(int i = 0; i < strLength; i++) {
				sum = sum + challenge(str.charAt(i));
			}
			System.out.println(sum);
			return sum;
	  }
	  
	  public static int difficulty(char c){   
		  switch(c){          
		  	case 'e':      
		  	case 'E':    
		  		return 1;     
		  	case 'm':     
		  	case 'M':      
		  		return 3;       
		  	case 'h':       
		  	case 'H':
		  	   return 5; 
		  	default: 
		  		return 0;   
		  }  
	  } 
	
	  public static void main(String s[]) {
		  System.out.println( winner("EM",""));
	  }
	  
	  public static int challenge(char c) {
		  
		  switch(c) {
		  	case 'e' :
		  	case 'E' :
		  		return 1;
		  	
		  	default :
		  		return 0;
			  
		  }
		  
		 
		  
	  }
}
