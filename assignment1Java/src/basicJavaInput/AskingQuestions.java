package basicJavaInput;

import java.util.Scanner;

public class AskingQuestions {

	public static void main(String[] args) {
//Declaring variables
		String yourName;
		int yourAge;
		double yourWage;
// Create a scanner		
		Scanner input = new Scanner(System.in);
//Taking input for ----Hello. What's your name?
		System.out.println("Hello. Whats your name? ");
		yourName = input.next();	
//Taking input for----Hi [name]! How old are you?
		System.out.println("Hi " +yourName+  " How old are you? ");
		yourAge = input.nextInt();
//Taking input for --So you're [age], eh? That's not old at all!--How much do you make, [name]?
		System.out.println("So you're " +yourAge+ ", eh? That's not old at all!" +'\n' + "How much do you make, " +yourName);
		yourWage = input.nextDouble();
//Finally, output this line---[wage]! That's really good for your [age]!
		System.out.println(+yourWage+ "! That's really good for your "+yourAge+ " !");
	}

}
