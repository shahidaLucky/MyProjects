package javaObjects;

public class Factorial {

	public static void main(String[] args) {
		double num = 28;
		System.out.println("Factorial is: " + recFact(num));
	}

	static double recFact(Double num) {
		if (num == 0) {
			System.out.println("If Succeed");
			return 1;
		} else {
			System.out.println(num);
			double result = (num * recFact(num - 1));
			System.out.println("After Recursion : " +result);
			return result;
		}
	}
	private static int facIterative(int number) {

		int facNumber = 1;
		for (int i = 1; i < number; i++) {
			facNumber = facNumber * (i + 1);
		}
		return facNumber;
	}
}
