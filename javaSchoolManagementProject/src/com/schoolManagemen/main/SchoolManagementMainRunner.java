package com.schoolManagemen.main;

import com.schoolManagement.services.SchoolManagementDAO;
import com.schoolManagement.services.SchoolManagementIMP;

public class SchoolManagementMainRunner {

	public static void main(String[] args) {
	
		SchoolManagementDAO school = new SchoolManagementIMP();
		school.createTeacherDepartmentManyToOne();
		school.createTeacher1Department1OneTOMany();

	}

}
