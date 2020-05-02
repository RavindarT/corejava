package com.core.tests;

public class PalindromeCounter {
	public static void main(String a[]) {
		System.out.println("count::"+countPalindromes("mom"));
	}
	
	  public static int countPalindromes(String s) { 
		  // Write your code here      
		  int number = s.length();
		  int l = 0; 
		  System.out.println(number+":::"+((2*number) -1));
		  for (int k = 0; k <= (2*number) -1 ; ++k) {   
			  int i = k / 2;      
			  int j = i + k % 2;  
			  System.out.println( i+" == "+ j);
			  while (i >= 0 && j < number && s.charAt(i) == s.charAt(j)) {  
//				  System.out.println( s.charAt(i)+" == "+ s.charAt(j));
				  l++;       
				  i--;     
				  j++;   
			  }   
		  }     
		  return l;    
		  
	  }
/**
 * 
 */
	  public static int count = 0;   
	  public static int countPalindromes1(String s) {
		  for(int i = 0; i < s.length() ; i++){ 
			  expand(s,i,i);   
			  expand(s,i,i+1);
		  }    
		  return count;
	  }   
	  
	  public static void expand(String s , int left, int right){ 
		  while(left >= 0 && right < s.length() && (s.charAt(left) == s.charAt(right))){ 
			  count++;          
			  left--;    
			  right++;    
		  }   
	  }  
	  
	  /**
	   * 
	   */
	  
	  public static int countPalindromes2(String s) {  
		  int count = 0;   
		  int strlength = s.length(); 
		  
		  for(int i=0; i<strlength;i++){
			  
			  for(int j = strlength - 1; j >= i ; j--){  
				  if(s.charAt(i) == s.charAt(j)){     
					  if(checkPalindrome(s,i,j)){   
						  count++;            
					  }         
				  }
			  }
			  
		  }
		  return count;
	  }
	  
	  public static boolean checkPalindrome(String s, int l, int m){
		  if(l == m){       
			  return true;   
		  }        else{  
			  for(int k = 0;k<=(m-l)/2;k++){  
				  if(s.charAt(k+l) != s.charAt(m - k)) 
					  return false;           
			  }
		  }
		  return true;  
	  }
}
