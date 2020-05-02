package com.core.test;

import java.util.Arrays;

public class CompareEx {

	public static void main(String a[]) {
		Comporator comp = new Comporator();
		System.out.println( comp.compare("A", null));
		
		
	}
	
}

class Comporator{
	
		public boolean compare(int a, int b) {
			if(a == b) {
				return true;
			}  else 
				return false;
		}
		

		public boolean compare(String a, String b) {
			if (a == null && b == null) {
				return true;
			}
			
			if(a != null && a.equals(b)) {
				return true;
			}  else 
				return false;
		}
		
		public boolean compare(int[] a, int[] b) {
			
			
			if( Arrays.equals(a, b)) {
				return true;
			}  else 
				return false;
		}
}
