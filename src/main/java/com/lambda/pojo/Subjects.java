package com.lambda.pojo;

public class Subjects{
	
	String subjectName;
	
	int marks;

	public Subjects(String subjectName, int marks) {
		super();
		this.subjectName = subjectName;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Subjects [subjectName=" + subjectName + ", marks=" + marks + "]";
	}
	
	
	
	
}