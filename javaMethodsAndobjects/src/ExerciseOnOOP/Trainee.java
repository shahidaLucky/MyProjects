package ExerciseOnOOP;

public class Trainee extends Employees {

	double basicSalary;

	public Trainee(long employeeId, String employeeName, String employeeAddress, long employeePhone,
			double basicSalary) {
		super(employeeId, employeeName, employeeAddress, employeePhone);
		this.basicSalary = basicSalary;

	}

	void calculateSalary() {
		double salary;
		salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
		System.out.println("Trainee:  The salary is : $" + salary);
	}
	void calculateTransportAllowance() {
		// double transportAllowance = (15/100) * basicSalary;
		double transportAllowance = 10 * basicSalary / 100;
		System.out.println("Tranee: Transportation Allowance is : $" + transportAllowance);
	}

}
