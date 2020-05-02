package com.core.test;

public class CoderFriends {
	
	public static void main(String a[]) {
		compare("EEH", "EEH");
	}
	
	public static int checkWaitage(String str) {
		int length = str.length();
		int size = 0;
		for(int i = 0; i < length; i++) {
			if(str.charAt(i) == 'E') {
				size = size + 1;
			} else if(str.charAt(i) == 'M') {
				size = size + 3;
			} else if(str.charAt(i) == 'H') {
				size = size + 5;
			}
		}
		return size;
	}
	
	public static void compare(String erica, String bob) {
		int ericaSize = checkWaitage(erica);
		int bobSize = checkWaitage(bob);
		
		if(ericaSize > bobSize) {
			System.out.println("Erica wins");
		} else if(ericaSize < bobSize) {
			System.out.println("Bob wins");
		}  else if(ericaSize == bobSize) {
			System.out.println("Tie");
		}
	}
	
}
