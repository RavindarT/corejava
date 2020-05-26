package com.staticex;

import java.lang.reflect.Method;

public class StaticEx extends A {

	public static void main(String ... a) {
		
		A.method();
		A.i = 10;
	}
	

}

//static we cannot put static in class
 class A{
	static void method() {
		
	}
	static int i;
}