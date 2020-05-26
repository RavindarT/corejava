package com.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringEx {

	public static void main(String ...strings ) {
		
		String str = "ABC";
		
		StringBuffer sbBuffer = new StringBuffer();
		
		sbBuffer.append(str);
		
		str = sbBuffer.reverse().toString();
		
		System.out.println(str);
		
		
		String a = "sam";
		char [] a1 = a.toCharArray();
		List<Character> l = new ArrayList<>();

		for(char a2 : a1) {
			l.add(a2);
		}
		
		System.out.println(l);
		
		 Collections.reverse(l);
		 
		 System.out.println(l);
		 l.stream().forEach( (temp) -> System.out.print(temp) );
	}
}
