package com.employeeJPQLApplication.services;

import java.util.List;

import com.employeeApplicationUsingJPQL.entities.Employee;

public interface EmployeeDAO {

	public void mainEmployee();
	public boolean createEmployee(Employee employee);
	public void updateEmployeeByID(int givenId);
	public void removeEmployee(int givenId);
	public Employee findEmployee(int givenId);
	
	public List<Employee> findEmployees(); // if not found returns null
	public void showEmployee(EmployeeDAO employee);
	
	
}
