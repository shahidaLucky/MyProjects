package ExerciseOnOOP;

public class InheritanceActivity {

	public static void main(String[] args) {

		Manager manager1 = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
		// System.out.println("Manager: ");
		manager1.calculateSalary();
		manager1.calculateTransportAllowance();

		Trainee trainee1 = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
		//System.out.println(trainee1);
		trainee1.calculateSalary();
		trainee1.calculateTransportAllowance();

	}

}
