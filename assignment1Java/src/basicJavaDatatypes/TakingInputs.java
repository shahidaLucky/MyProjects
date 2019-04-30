package basicJavaDatatypes;

import java.util.Scanner;

public class TakingInputs {

/* 2.Write a Java program that takes two numbers as input and display the product of two numbers. */
	
	public static void main(String[] args) {
		
		double number1, number2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the first number : ");
		number1 = input.nextDouble();
		System.out.println("Please enter the second number : ");
		number2 = input.nextDouble();
		
		double output = number1*number2;
		
		System.out.println("The output is : " +output);
	}

}
