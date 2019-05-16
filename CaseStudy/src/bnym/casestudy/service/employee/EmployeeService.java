package bnym.casestudy.service.employee;

import java.util.List;
import bnym.casestudy.entity.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();
	public Employee getEmployeenById(Long id);
	public boolean saveEmployees(Employee employee);
	public boolean deleteEmployeeById(Long id);
}
