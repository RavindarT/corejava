package com.core.test;

public class Holes {
	
	public static void main(String[] a) {
		System.out.println( holesCount(20));
	}
	
	public static int holesCount(int numToStr) {
		
		String str = String.valueOf(numToStr);
		int length = str.length();
		int count = 0;
		for(int i = 0; i < length; i++) {
			if(str.charAt(i) == '2') {
				count = count + 1;	
			}
		}
		
		return count;
	}
	
}
