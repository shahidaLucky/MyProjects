package com.schoolManagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class TeacherManyToOne {
	@Id
	private int eid;
	private String ename;
	private double salary;

	@ManyToOne
	private DepartmentManyToOne department;
	
	// constructors
	
	public TeacherManyToOne() {
		super();
	}

	public TeacherManyToOne(int eid, String ename, double salary, DepartmentManyToOne department) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.department = department;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public DepartmentManyToOne getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentManyToOne department) {
		this.department = department;
	}
	


	

}
