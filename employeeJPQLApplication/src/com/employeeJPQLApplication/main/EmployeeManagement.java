package com.employeeJPQLApplication.main;

import java.util.Scanner;

import com.employeeApplicationUsingJPQL.entities.Employee;
import com.employeeJPQLApplication.services.EmployeeDAO;
import com.employeeJPQLApplication.services.EmployeeServices;

// this class is like main runner where all the CRUD operations will take place and in mainClass just create Menu

public class EmployeeManagement {

	// menu for the mainClass to display or to run
	public void menuEmployee() {
		System.out.println("1. Enter New Employee");
		System.out.println("2. Search Employee");
		Scanner inScanner = new Scanner(System.in);
		int choice = inScanner.nextInt();

		switch (choice) {
		case 1:
			inputEmployee();
			break;
		case 2:
			findEmployee();
			break;
		default:
			break;
		}
	}

	// Scanner capturing the data
	public void inputEmployee() {
		// form to input the employee data

		// 1. capture employee data using SCANNER class
//		Employee vEmployee = new Employee(120, "Kawsar222221", "Mohammed", "347-369-0024");
		// 2. store data
		Scanner inScanner = new Scanner(System.in);
		System.out.println("Enter Id");
		int eId = inScanner.nextInt();
		inScanner.nextLine();
		System.out.println("Enter First Name");
		String eFirstName = inScanner.nextLine();
		System.out.println("Enter Last Name");
		String eLastName = inScanner.nextLine();
		System.out.println("Phone Number");
		String phone = inScanner.nextLine();
		Employee vEmployee = new Employee(eId, eFirstName, eLastName, phone);
		createEmployee(vEmployee);
	}

	public void createEmployee(Employee vEmployee) {
		EmployeeServices es = new EmployeeServices();
		// you may include businedd rule here (ie validations)
		boolean successBoolean =  es.createEmployee(vEmployee);
		if(successBoolean == true) {
			System.out.println("User Create Success");
		}else {
			System.out.println("Something Went Wrong.");
		}
	}

	public void findEmployee() {

		EmployeeDAO es = new EmployeeServices();
		// es.mainEmployee();

		for (int i = 1; i <= 5; i++) {
			int vGivenId = i;
			Employee employee = es.findEmployee(vGivenId);
			if (employee != null) {
				System.out.println("This is the Employee Name ================> " + employee.getFname());
			} else {
				System.out.println("Employee Not Found");
			}
		}
	}
}
