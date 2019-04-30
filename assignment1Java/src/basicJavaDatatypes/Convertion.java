package basicJavaDatatypes;

import java.util.Scanner;

public class Convertion {

	/*1.Write a Java program that reads a number in inches, converts it to meters. 
Note: One inch is 0.0254 meter. */
	
	public static void main(String[] args) {
		double inch;
		double meters;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please Input a value for inch: ");
		inch = input.nextDouble();
		meters = inch * 0.0254;
		System.out.println(inch + " inch is : " + meters + " meters ");
	}
}