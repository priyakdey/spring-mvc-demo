package com.priyak.webapp.model;

import javax.validation.constraints.NotEmpty;


public class Customer {
	
	private String firstName;
	
	@NotEmpty
	private String lastName;
	
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
	

}
