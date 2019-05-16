package com.bnym.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
public class UserRegistration {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotEmpty
	@Email(message = "Pleae provide you email")
	private String email;
	@NotEmpty
	private String password;

	// =====================--Constructors====================================
	public UserRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserRegistration(Long id, @NotEmpty @Email(message = "Pleae provide you email") String email,
			String password) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
	}

//======================Getter/Setter==============================	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
