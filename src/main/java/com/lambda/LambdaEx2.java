package com.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaEx2 {

	public static void main(String ...strings ) {
		
		String temp = "ABC";
		
		char[] t = temp.toCharArray();
		

		int i = (int) Arrays.asList(temp.toCharArray()).stream().count();
		System.out.println(i);
		
		int [] intar =  {1,2};
		Emp[] emp = {new Emp(100), new Emp(200) } ;
//		int s = Arrays.stream(emp).
//		System.out.println(s);


	}
	
}

class Emp{
	
	int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Emp(int salary) {
		super();
		this.salary = salary;
	}
	
	
	
}