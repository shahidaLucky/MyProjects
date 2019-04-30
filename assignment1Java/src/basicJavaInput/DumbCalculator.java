package basicJavaInput;

import java.util.Scanner;

public class DumbCalculator {

	public static void main(String[] args) {
//declaring variables
		double number1, number2, number3, result;
//Create a scanner to take input 
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the 1st number :");
		number1 = input.nextInt();
		
		System.out.println("Please enter the 2nd number :");
		number2 = input.nextInt();
				
		System.out.println("Please enter the 3dr number :");
		number3 = input.nextInt();
		
		result= (number1+number2+number3)/2;
		
		System.out.println("The result is  :  "  +result);
	

	}

}
