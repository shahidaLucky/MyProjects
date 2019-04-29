package titutionAssistanceProgram.dao;

import titutionAssistanceProgram.entity.Employee;

public interface EmployeeDAO {

	public void createEmployee(int employeeID, String firstName, String lastName, String email, String mobile);
	

}
