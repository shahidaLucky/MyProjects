package com.employeeJPQLApplication.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.employeeApplicationUsingJPQL.entities.Employee;

public class EmployeeServices implements EmployeeDAO {

	@Override
	public boolean createEmployee(Employee employee) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("employeeJPQLApplication");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.getTransaction().commit(); // commit / save/ sending record to DB
		
		//closing 
		entityManager.close();
		entityManagerFactory.close();
		
		return true;
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEmployeeByID(int givenId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeEmployee(int givenId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee findEmployee(int pGivenId) {
		// step 1 (Create factory)
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("employeeJPQLApplication");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		// step 2.2 (Query)                                                      Employee employee = new Emp
		Query queryOneEmployee = entityManager.createQuery("SELECT employee FROM Employee employee WHERE employee.eid = :givenId");
		queryOneEmployee.setParameter("givenId", pGivenId);
		List<Employee> employeeList = queryOneEmployee.getResultList();
		
		//if employeelist.size ==0 ----not found
		//else found
		
		Employee vEmployee = null;
		if(employeeList.size() != 0) {
			vEmployee = employeeList.get(0);
		}
		

		System.out.println(employeeList.toString());

		// step 3 --closing factory and manager
		entityManager.close();
		entityManagerFactory.close();
		
		return vEmployee;
	}

	@Override
	public List<Employee> findEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void showEmployee(EmployeeDAO employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mainEmployee() {
		// TODO Auto-generated method stub

	}

}
