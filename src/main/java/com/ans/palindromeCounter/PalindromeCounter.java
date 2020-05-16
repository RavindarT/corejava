package com.ans.palindromeCounter;

public class PalindromeCounter {

	
public static void main(String a[]) {
//		int n = 4;
//		String st = "abca";
//		for(int i = n; i == 0 ; i--) {
//			
//		}
		String as= "abca";
		int i = possiblePalinByRemovingOneChar(as);
		System.out.println(  as.charAt(i) );
		
	}
	

static int possiblePalinByRemovingOneChar(String str) 
{     
    int low = 0, high = str.length() - 1; 
    while (low < high)  
    { 
        if (str.charAt(low) == str.charAt(high))  
        { 
            low++; 
            high--; 
        }  
        else
        { 
            if (isPalindrome(str, low + 1, high)) 
                return low; 

            if (isPalindrome(str, low, high - 1)) 
                return high; 
            return -1; 
        } 
    }     
    return -2; 
} 

static boolean isPalindrome(String str, int low, int high){ 
	while (low < high)  { 
		if (str.charAt(low) != str.charAt(high)) 
			return false; 
		low++; 
		high--; 
	} 
	return true; 
} 

	  public static int countPalindromes(String s) { 
		  // Write your code here      
		  int Number = s.length(), l = 0; 
		  for (int k = 0; k <= 2*Number-1; ++k) {   
			  int i = k / 2;      
			  int j = i + k % 2;  
			  while (i >= 0 && j < Number && s.charAt(i) == s.charAt(j)) {  
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
			  for(int j = strlength - 1;j>=i;j--){  
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
