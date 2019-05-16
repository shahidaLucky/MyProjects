package com.bnym.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;
import javax.validation.constraints.NotEmpty;

import org.springframework.stereotype.Controller;

@Entity
public class Address {
	@Id
//	@TableGenerator(name="address_seq", initialValue=0, allocationSize=50)
//	@GeneratedValue(strategy = GenerationType.TABLE, generator="address_seq")// for Oracle
	@GeneratedValue(strategy = GenerationType.AUTO) // for mysql
	private Long id;

	@NotEmpty(message="enter your address")
	private String street;
	@NotEmpty(message="enter your city")
	private String city;
	@NotEmpty(message="enter your state")
	private String state;
	@NotEmpty(message="enter your zip")
	private String zipcode;
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
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
