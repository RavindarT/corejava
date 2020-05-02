package com.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class StreamSample {
	public static void main(String a[]) {
		
		
		List list = new ArrayList<>();
		list.stream();
		list.forEach(System.out::print);
		Map map = new HashMap();
		
//		IntStream.range(0, 10).forEach(System.out::println);
		
		Object[] o = new Object[3];
		o[0] = new Test2("AS");
		o[1] = new Test2("AS");
		o[2] = new Test1(12);
		Arrays.stream(o)
			.sorted()
			.forEach( x -> System.out.println(x));;
		
	}
}

class Test2{
	String name;

	public Test2(String name) {
		super();
		this.name = name;
	}
	
}

class Test1{
	int age;

	public Test1(int age) {
		super();
		this.age = age;
	}
	
}