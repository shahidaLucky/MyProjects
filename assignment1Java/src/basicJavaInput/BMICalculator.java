package basicJavaInput;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
//Declaring variables		
		double weightInPound;
		double weightInKg;
		double heightFeet;
		double heightInch;
		double height;
		double heightInCm;
		double heightInMeter;
		double BMI;
		
//Create Scanner for taking input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your weight in pound :");
		weightInPound= input.nextDouble();
		weightInKg = weightInPound*0.453592;
		System.out.println("Your weight is : "+weightInKg+ " Kg");
		
		System.out.println("Please enter your height in feet: ");
		heightFeet= input.nextDouble();
		System.out.println("Please enter your height in inches: ");
		heightInch= input.nextDouble();
		height= ((heightFeet*12)+(heightInch));
		heightInCm= (height*2.54);
		heightInMeter= (heightInCm*0.01);
		System.out.println("Your height in meter is :" +heightInMeter+ " meter");
		
		BMI = weightInKg/(heightInMeter * heightInMeter);
		System.out.println("Your BMI is : " +BMI);

	}

}
