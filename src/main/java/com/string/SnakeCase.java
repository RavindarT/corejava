package com.string;

public class SnakeCase {

//	Input :  I got intern at geeksforgeeks
//	Output : i_got_intern_at_geeksforgeeks

	public static void main(String[] args) {
		String str = "I got intern at geeksforgeeks";
		str = str.toLowerCase();
		System.out.println(str);
		str = str.replaceAll(" ", "_");
		System.out.println(str);
	}
	
}
