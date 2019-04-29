package ExerciseOnOOP;

public class Manager extends Employees {

	double basicSalary;

	public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone,
			double basicSalary) {
		super(employeeId, employeeName, employeeAddress, employeePhone);
		this.basicSalary = basicSalary;

	}

	void calculateSalary() {
		double salary;
		salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
		System.out.println("SubClass Manager : The salary is : $" + salary);
	}

	void calculateTransportAllowance() {
		// double transportAllowance = (15/100) * basicSalary;
		double transportAllowance = 15 * basicSalary / 100;
		System.out.println("Manager : Transportation Allowance is : $" + transportAllowance);
	}

}
