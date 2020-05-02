package com.core.test;

public class Pallindrome {

	
	public static void main(String[] args) {
		
		System.out.println(palindrom("maddam"));
		
	}
	
	static String palindrom(String p) {
		
		int length = p.length();
		
		for(int i = 0 ; i < length / 2; i ++) {
			 
			 System.out.println(p.charAt(i)+"::::"+ p.charAt(length-1-i) );
			 if(p.charAt(i) != p.charAt(length-1-i) ) {
				 
				 return "Not Palindrome";
			 }
			
		}
		
		return "palindrome";
	}
}
