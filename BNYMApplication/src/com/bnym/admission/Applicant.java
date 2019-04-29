package com.bnym.admission;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
public class Applicant {

	@NotEmpty(message = "Applicant name can not be empty")
	@Size(max = 25, message = "Name must be less than 25 characters")
	private String sName;

	@NotEmpty(message="Please provide the course")
	private String sCourse;

	@Pattern(message="Please enter the correct format", regexp="\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")
	private String sMobile;// long is not primitive type it is an object.

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	 @NotNull(message="Date of birth is required")
	// @Past(message="Date of birth must be a past date")
	@Past(message = "Birth Day cannot be in future !!!")
	private Date sDOB;

	private List<String> sSkills;
	
	@NotNull
	@Valid
//	@NotEmpty(message="enter address")
	private Address sAddress;

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsCourse() {
		return sCourse;
	}

	public void setsCourse(String sCourse) {
		this.sCourse = sCourse;
	}

	public String getsMobile() {
		return sMobile;
	}

	public void setsMobile(String sMobile) {
		this.sMobile = sMobile;
	}

	public Date getsDOB() {
		return sDOB;
	}

	public void setsDOB(Date sDOB) {
		this.sDOB = sDOB;
	}

	public List<String> getsSkills() {
		return sSkills;
	}

	public void setsSkills(List<String> sSkills) {
		this.sSkills = sSkills;
	}

	public Address getsAddress() {
		return sAddress;
	}

	public void setsAddress(Address sAddress) {
		this.sAddress = sAddress;
	}
}
