package bnym.casestudy.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bnym.casestudy.entity.Employee;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {


	//Case -n-sensitive
		//List<Employee> findByfirstNameIgnoreCaseAndSAddressCityIgnoreCase(String firstname,String city);
		//Exact match - case sensitive
		//List<Employee> findBysNameAndSAddressCity(String name, String city);
}
