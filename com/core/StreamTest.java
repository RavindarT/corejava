package com.core;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String a[]) {
		
		List<Integer> i = Arrays.asList(1,2);
	
		i.stream()
			.filter( t -> t % 2 == 0)
			
			.collect(Collectors.toList());
		
	}
}
