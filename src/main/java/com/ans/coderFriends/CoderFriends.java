package com.ans.coderFriends;

public class CoderFriends {

	public static String winner(String erica, String bob) { 
		  // Write your code here     
		  int countE = 0;  
		  int countB = 0;  
		  
		  char[] ericaCharArray = erica.toCharArray();  
		  
		  char[] bobCharArray = bob.toCharArray();    
		  
		  for(char c : ericaCharArray) {          
			  countE += difficulty(c);
		  }
		  
		  for(char c : bobCharArray) {  
			  countB += difficulty(c);    
		  }
		  
		  if(countE > countB)  {      
			  return "Erica"; 
		  } else if(countE == countB) {
			  return "Tie";
		  }

		  return "Bob";    
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
	
}
