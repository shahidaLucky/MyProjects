package com.schoolManagement.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class DepartmentOneToMany {

	@Id
	private int dId;
	private String dName;
	
	@OneToMany(targetEntity = TeacherOneToMany.class)
	private List teacherList;

	//Constructors
	public DepartmentOneToMany() {
		super();
	}

	public DepartmentOneToMany(int dId, String dName, List teacherList) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.teacherList = teacherList;
	}
	
	
}
