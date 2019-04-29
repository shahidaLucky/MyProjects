package titutionAssistanceProgram.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import titutionAssistanceProgram.dao.EmployeeDAO;
import titutionAssistanceProgram.entity.Employee;
import titutionAssistanceProgram.entity.EmployeeJobBasic;
import titutionAssistanceProgram.entity.HomeAddress;
import titutionAssistanceProgram.entity.WorkAddress;

public class EmployeeService implements EmployeeDAO {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("titutionAssistanceProgram");
	static EntityManager entityManager = emf.createEntityManager();

	@Override
	public void createEmployee(int employeeID, String firstName, String lastName, String email, String mobile) {
		
		Employee employee =  new Employee();
		
		HomeAddress homeAddress = new HomeAddress();
		homeAddress.setStreetLine1("240 Greenwich St");
		homeAddress.setStreetLine2("");
		homeAddress.setAddressID(1);
		homeAddress.setCity("NYC");
		homeAddress.setState("NY");
		homeAddress.setZipCode(10014);
		
		
		WorkAddress workAddress = new WorkAddress();
		workAddress.setStreetLine1("240 Greenwich St");
		workAddress.setStreetLine2("");
		workAddress.setLocationID(1);
		workAddress.setCity("NYC");
		workAddress.setState("NY");
		workAddress.setZipCode(10014);

		
		EmployeeJobBasic employeeJobBasic = new EmployeeJobBasic();
		employeeJobBasic.setJobID(1);
		employeeJobBasic.setJoinDate("123456");
		employeeJobBasic.setStartDate("34324234");
		employeeJobBasic.setEndDate("33243534");
		employeeJobBasic.setDesignation("Dev");
		
		
		employee.setEmployeeID(employeeID);
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setEmail(email);
		employee.setHomeAddress(homeAddress);
		employee.setWorkAddress(workAddress);
		employee.setEmployeeJobBasic(employeeJobBasic);
		employee.setMobile(mobile);
		
		saveEmployee(employee);
		
	}
	
	// save Employee method for commit
		public void saveEmployee(Employee employee) {
			entityManager.getTransaction().begin();
			entityManager.persist(employee);
			entityManager.getTransaction().commit();
		}

	// closing connection
	public static void closeManagerAndFactory() {
		entityManager.close();
		emf.close();

	}
}
