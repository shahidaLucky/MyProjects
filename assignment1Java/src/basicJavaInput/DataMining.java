package basicJavaInput;

import java.util.Scanner;

public class DataMining {

	public static void main(String[] args) {
//First, print the following line:--Please enter the following information so I can sell it for a profit!
		System.out.println("Please enter the following information so I can sell it for a profit! ");
//Declaring variables
		String firstName;
		String lastName;
		int grade;
		int id;
		String login;
		double gpa;
//Create a scanner for taking input form user
		Scanner input= new Scanner(System.in);
		
		System.out.println("Please enter your first name: ");
		firstName= input.next();
		
		System.out.println("Please enter your last name: ");
		lastName= input.next();
		
		System.out.println("Please enter your ID: ");
		id= input.nextInt();
	
		System.out.println("Ready to Login:");
		login = input.next();
		
		System.out.println("Please enter your grade : ");
		grade= input.nextInt();
		System.out.println("Please enter your gpa : ");
		gpa= input.nextInt();
		if((grade>=9 && grade<=12)&&(gpa>=0 && gpa<=4)) {
			System.out.println('\n'+ "Your Information: " + '\n' +"Login:  " +login + '\n' + "ID:    " +id + '\n' + "Name:  " +lastName+ 
					", " +firstName + '\n' + "GPA:    " +gpa + '\n' + "Grade:  " +grade);
		}
		else {
		System.out.println("You have entered wrong information.");
	}
	}
}
