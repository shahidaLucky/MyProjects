package com.employeeJPQLApplication.main;

import java.util.Scanner;

import com.employeeApplicationUsingJPQL.entities.Employee;
import com.employeeJPQLApplication.services.EmployeeDAO;
import com.employeeJPQLApplication.services.EmployeeServices;

public class MainEmployee {

	public static void main(String[] args) {

		System.out.println("Employee Application");

		EmployeeDAO es = new EmployeeServices();
		// es.mainEmployee();

		//Employee AMnagement Application
		EmployeeManagement em = new EmployeeManagement();
		em.menuEmployee();

		//Account Management
		
		// Department Management
		
	

	}
}
