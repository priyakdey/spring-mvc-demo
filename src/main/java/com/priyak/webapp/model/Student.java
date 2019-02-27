package com.priyak.webapp.model;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String favouriteProgrammingLanguage;
	private String[] operatingSystem;

	private LinkedHashMap<String, String> listOfCountries;
	private LinkedHashMap<String, String> listOfProgrammingLanguages;
	private LinkedHashMap<String, String> operatingSystems;
	// No-arg constructor
	public Student() {
		// populate country code against country name : ISO code used
		listOfCountries = new LinkedHashMap<>();
		listOfCountries.put("IN", "India");
		listOfCountries.put("UK", "United Kingdom");
		listOfCountries.put("FR", "France");
		listOfCountries.put("DE", "Germany");
		
		// Populate the list of programming langauges
		listOfProgrammingLanguages = new LinkedHashMap<>();
		listOfProgrammingLanguages.put("Java", "Java");
		listOfProgrammingLanguages.put("Python", "Python");
		listOfProgrammingLanguages.put("Ruby", "Ruby");
		listOfProgrammingLanguages.put("C#", "C#");
		
		//Popluate the operating systes
		operatingSystems = new LinkedHashMap<>();
		operatingSystems.put("Windows", "Windows");
		operatingSystems.put("Mac OS", "Mac OS");
		operatingSystems.put("Linux", "Linux");
	}
	
	// Getters and setters for the field parameters
	public String getFirstName() {
		return firstName;
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
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
	
	public LinkedHashMap<String, String> getListOfCountries(){
		return this.listOfCountries;
	}

	public String getFavouriteProgrammingLanguage() {
		return favouriteProgrammingLanguage;
	}

	public void setFavouriteProgrammingLanguage(String favouriteProgrammingLanguage) {
		this.favouriteProgrammingLanguage = favouriteProgrammingLanguage;
	}
	
	public LinkedHashMap<String, String> getListOfProgrammingLanguages(){
		return this.listOfProgrammingLanguages;
	}
	
	public String[] getOperatingSystem() {
		return this.operatingSystem;
	}
	
	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	
	public LinkedHashMap<String, String> getOperatingSystems() {
		return this.operatingSystems;
	}
	
}
