package com.bnym.admission;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class UserRegistration {

	@NotEmpty
	@Email(message = "Pleae provide you email")
	private String email;
	private String password;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
