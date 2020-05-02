package com.core;

public class EnumTestValue {
	public  static void main(String a[]) {
		System.out.println(TestEnum.Test);
		
		for( Enum e : TestEnum.values()) {
			System.out.println(e);
		}
		
	}
	
	public EnumTestValue() {
		// TODO Auto-generated constructor stub
	}
	

	public EnumTestValue(int i) {
		System.out.println(i);
	}
	
}
