package jpa.entitymodels;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Student {

	@Id
	@Column(name = "email")
	private String sEmail;
	
	@Column(name = "name")
	private String sName;
	
	@Column(name = "password")
	private String sPass;

	@OneToMany
	private List<Course> sCourses;
	
	

	public Student() {
		this.sEmail = "defaultemail";
		this.sName = "defaultName";
		this.sPass = "1Default";
	}

	public Student(String sEmail, String sName, String sPass, List<Course> sCourses) {
		super();
		this.sEmail = sEmail;
		this.sName = sName;
		this.sPass = sPass;
		this.sCourses = sCourses;
	}

	public Student(String sEmail, String sName, String password) {
		super();
		this.sEmail = sEmail;
		this.sName = sName;
		this.sPass = password;
	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getPassword() {
		return sPass;
	}

	public void setPassword(String password) {
		this.sPass = password;
	}
	
}
