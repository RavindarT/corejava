package com.core;

public class NewLine {
 public static void main(String s[]) {
	 String str = "asv\nasc";
	 System.out.println(str);
	 
	 Test t = new Test("asv\nasc");
	 System.out.println(t.toString());
 }
}

class Test{
	String a;

	public Test(String a) {
		super();
		this.a = a;
	}

	@Override
	public String toString() {
		return "Test [a=" + a + "]";
	}
	
}