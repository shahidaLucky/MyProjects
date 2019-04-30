package basicJavaInput;

import java.util.Scanner;

public class AgeInFiveYears {

	public static void main(String[] args) {
/*      Ask the user for their name. 
		Then display their name to prove that you can recall it. 
		Ask them for their age. 
		Then display what their age would be five years from now. 
		Then display what their age would be five years ago.*/
		
		String name;
		int age;
		int fiveYearsAfter;
		int fiveYearsBefore;
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Hi there. What's your name?");
		name=input.next();
		System.out.println(name);
		
		System.out.println("Hi, " +name+ "! My name is Java. Nice to meet you.\r\n" + "How old are you?");
		age=input.nextInt();
		System.out.println(age);
		fiveYearsAfter = age+5;
		fiveYearsBefore = age-5; 
//Did you know that in five years you will be 36 years old? And five years ago you were 26! Imagine that!		
		System.out.println("Did you know that in five years you will be " 
        +fiveYearsAfter+ " years old? And five yeras ago you were " +fiveYearsBefore+ "! Imagine that!");
		
		

	}

}
