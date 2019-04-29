package com.schoolManagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class TeacherManyToMany {

	//Properties
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)// for oracle its SEQUENCE for mySql its IDENTITY 
	private int eId;
	private String eName;
	private double salary;

	// Constructors
	public TeacherManyToMany() {
		super();
	}

	public TeacherManyToMany(int eId, String eName, double salary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.salary = salary;
	}
	// getter and setter methods

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
