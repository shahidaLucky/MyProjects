package com.bnym.entity;


import javax.validation.constraints.NotEmpty;

import org.springframework.stereotype.Controller;

@Controller
public class Address {

	@NotEmpty(message="enter your address")
	private String street;
	@NotEmpty(message="enter your city")
	private String city;
	@NotEmpty(message="enter your state")
	private String state;
	@NotEmpty(message="enter your zip")
	private String zipcode;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	
}
