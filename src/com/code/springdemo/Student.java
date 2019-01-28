package com.code.springdemo;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String,String> countryOptions;
	private String bestLangauge;
	
	public Student(){
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("BR", "BRAZIL");
		countryOptions.put("USA", "United States of America");
		countryOptions.put("DE", "Germany");
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getBestLangauge() {
		return bestLangauge;
	}

	public void setBestLangauge(String bestLangauge) {
		this.bestLangauge = bestLangauge;
	}
	
	

}
