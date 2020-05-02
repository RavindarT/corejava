package com.core.test;

import java.util.ArrayList;
import java.util.List;

public class CountPairs {

	public static void main(String a[]) {
		
	}
	
	public static int countPairs(List<Integer> numbers, int n) { 
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		int count = 0;
		for(int i : numbers) {
			a.add(i);
			b.add(i + n);
		}
				
		for(int i : b) {
			if(a.contains(i))
				count ++;
			
		}
		
		return count;
	}
}
