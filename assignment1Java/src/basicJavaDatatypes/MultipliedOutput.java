package basicJavaDatatypes;

import java.util.Scanner;

/* 3.Write a Java program that takes a number and prints the results of it multiplied from 1 to 10 */

public class MultipliedOutput {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter a number: ");
		int number = input.nextInt();
		
		for(int i=0; i<10;i++) {
			System.out.println(number  + " x " + (i+1)+ " = " + (number*(i+1)));
		}

	}

}
