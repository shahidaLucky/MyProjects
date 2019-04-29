package titutionAssistanceProgram.main;

import titutionAssistanceProgram.dao.EmployeeDAO;
import titutionAssistanceProgram.dao.EmployeeJobBasicDAO;
import titutionAssistanceProgram.dao.HomeAddressDAO;
import titutionAssistanceProgram.dao.LoginDAO;
import titutionAssistanceProgram.dao.WorkAddressDAO;
import titutionAssistanceProgram.entity.Employee;
import titutionAssistanceProgram.services.EmployeeJobBasicService;
import titutionAssistanceProgram.services.EmployeeService;
import titutionAssistanceProgram.services.HomeAddressService;
import titutionAssistanceProgram.services.LoginService;
import titutionAssistanceProgram.services.WorkAddressService;

public class MyProjectMainRunnery {

	public static void main(String[] args) {
		System.out.println("Welcome");
		
		EmployeeDAO employeeDAO = new EmployeeService();
		EmployeeJobBasicDAO employeeJobBasicDAO =  new EmployeeJobBasicService();
		HomeAddressDAO homeAddressDAO = new HomeAddressService();
		LoginDAO loginDAO = new LoginService();
		WorkAddressDAO workAddressDAO = new WorkAddressService();		
		
		employeeDAO.createEmployee(1, "Shahida", "Lucky", "shahida.lucky@bnymellon.com", "929-505-4739");
		EmployeeService.closeManagerAndFactory();
	}

}
