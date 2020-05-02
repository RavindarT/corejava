package com.core;

import java.util.Date;

public class Candidate {
	
	int id;
	
	String name;

	Date expiryDate;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	public Date getExpiryDate() {
		return expiryDate;
	}
	
	public String getExpiryDate1() {
		return String.valueOf(expiryDate);
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Candidate(int id, String name, Date expiryDate) {
		super();
		this.id = id;
		this.name = name;
		this.expiryDate = expiryDate;
	}
	
	

}
