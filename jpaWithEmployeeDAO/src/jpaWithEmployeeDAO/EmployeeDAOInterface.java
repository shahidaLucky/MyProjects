package jpaWithEmployeeDAO;

public interface EmployeeDAOInterface {

	enum SQL{
		GET_ALL_EMPLOYEES("SELECT * FROM students");
	}
}
