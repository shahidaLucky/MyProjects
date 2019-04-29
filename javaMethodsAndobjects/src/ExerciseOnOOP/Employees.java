package ExerciseOnOOP;

public class Employees {

	// instance variables
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double hra = 1000.50;

	// Constructor
	public Employees(long employeeId, String employeeName, String employeeAddress, long employeePhone) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
	}

	// Methods
	void calculateSalary() {
		double salary;
		salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
		System.out.println("Employee : The salary is :  $" + salary);
	}

	void calculateTransportAllowance() {
		double transportAllowance = (10* basicSalary)/100;
		System.out.println("Employee: Transportation Allowance is : $" + transportAllowance);
	}

}
