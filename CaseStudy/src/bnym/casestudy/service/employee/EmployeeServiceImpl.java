package bnym.casestudy.service.employee;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bnym.casestudy.entity.Employee;
import bnym.casestudy.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	@Override // Method-1
	public List<Employee> getAllEmployees() {
		List<Employee> list = new ArrayList<Employee>();
		for (Employee employee : repository.findAll()) {
			list.add(employee);
		}
		System.out.println("All employee size in service: "+list.size());
		return list;
	}

	@Override // Method-2
	public Employee getEmployeenById(Long id) {
		Employee employee = repository.findById(id).get();
		return employee;
	}
	

	@Override // Method-3
	public boolean saveEmployees(Employee employee) {
		try {
			repository.save(employee);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	@Override // Method-4
	public boolean deleteEmployeeById(Long id) {

		try {
			repository.deleteById(id);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	

}
