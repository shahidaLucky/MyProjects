package com.bnym.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty(message = "Applicant name can not be empty")
	@Size(max = 25, message = "Name must be less than 25 characters")
	private String sName;

	@NotEmpty(message = "Please provide the course")
	private String sCourse;

	@Pattern(message = "Please enter the correct format", regexp = "\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")
	private String sMobile;// long is not primitive type it is an object.

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull(message = "Date of birth is required")
	// @Past(message="Date of birth must be a past date")
	@Past(message = "Birth Day cannot be in future !!!")
	private Date sDOB;

	private List<String> sSkills;

	@NotNull
	@Valid
//	@NotEmpty(message="enter address")
	private Address sAddress;

//-------------------------------------------Constructors------------------------------------------------
	public Applicant() {
		super();

	}

	public Applicant(Long id,
			@NotEmpty(message = "Applicant name can not be empty") @Size(max = 25, message = "Name must be less than 25 characters") String sName,
			@NotEmpty(message = "Please provide the course") String sCourse,
			@Pattern(message = "Please enter the correct format", regexp = "\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}") String sMobile,
			@NotNull(message = "Date of birth is required") @Past(message = "Birth Day cannot be in future !!!") Date sDOB,
			List<String> sSkills, @NotNull @Valid Address sAddress) {
		super();
		this.id = id;
		this.sName = sName;
		this.sCourse = sCourse;
		this.sMobile = sMobile;
		this.sDOB = sDOB;
		this.sSkills = sSkills;
		this.sAddress = sAddress;
	}

// -------------------------------------------------------getter/setter------------------------------------

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
