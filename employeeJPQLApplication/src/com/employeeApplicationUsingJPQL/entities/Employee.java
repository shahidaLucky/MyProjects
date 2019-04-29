package com.employeeApplicationUsingJPQL.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "jpaemployee")
@NamedQuery(query = "SELECT e FROM Employee e WHERE e.eid = :id", name = "Find Employee by ID")

public class Employee {

	@Id
	@Column(name = "employeeid")
	private int eid;

	@Basic
	@Column(name = "first_name")
	private String fname;

	@Basic
	@Column(name = "last_name")
	private String lname;

	@Basic
	@Column(name = "phone")
	private String phone;

	public Employee() {

	}

	public Employee(int eid, String fname, String lname, String phone) {
		// TODO Auto-generated constructor stub
		super();
		this.eid = eid;
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void printEmployee() {
		System.out.println("Employee with id: " + getEid() + ", First name: " + getFname() + ", Last name: "
				+ getLname() + ", phone: " + getPhone());
	}
}
