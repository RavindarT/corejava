package com.lambda.pojo;

import java.util.ArrayList;
import java.util.List;

public class StudentPojo {

	int rollNo;
	String firstName;
	String lastName;
	
	List<Subjects> subjectList = new ArrayList<>();

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Subjects> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(List<Subjects> subjectList) {
		this.subjectList = subjectList;
	}

	@Override
	public String toString() {
		return "StudentPojo [rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", subjectList=" + subjectList + "]";
	}
	
	
	
	
}

