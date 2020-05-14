package com.compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorEx {
	public static void main(String[] args) {
		
		List<String> stringList = new ArrayList<String>();
		stringList.add("CAT");
		stringList.add("ACT");
		
		String s = "CAT";
		char[] a = s.toCharArray();
		String s1 = "ACT";
		char[] a1 = s1.toCharArray();
		
		
		Arrays.sort(a);
		Arrays.sort(a1);
		System.out.println( Arrays.equals(a,a1) );
		
		
		Comparator comparator = new Comparator<Character>() {

			@Override
			public int compare(Character o1, Character o2) {				
				return o1.compareTo(o2);
			}
		};		
		(Arrays.asList(a)).sort(comparator);
		
		Comparable<String> comparable = new Comparable<String>() {
			
			@Override
			public int compareTo(String o) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		Comparator<String> comparator1 = new Comparator<String>() {			
			@Override
			public int compare(String o1, String o2) {				
				return o1.compareToIgnoreCase(o2);
			}
		};
 		
	}
}
