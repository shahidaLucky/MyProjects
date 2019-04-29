package jpa.mainrunner;

import java.util.Scanner;

import jpa.dao.CourseDAO;
import jpa.dao.StudentDAO;
import jpa.service.CourseService;
import jpa.service.StudentService;

public class SMSRunner {

	public static void main(String[] args) {
		System.out.println("Are you a(n)");
		System.out.println("1. Student");
		System.out.println("2. quit");
		System.out.println("Please, enter 1 or 2.");
		Scanner inScanner = new Scanner(System.in);

		int choice = inScanner.nextInt();
		switch (choice) {
		case 1:
			managementSystem(); // user login Flow
			break;
		default:
			System.out.println("Quiting Program.");
			break;
		}
	}

	public static void managementSystem() {
		System.out.println("Enter Your Email:");
		Scanner inScanner = new Scanner(System.in);
		String userEmail = inScanner.nextLine();
		System.out.println("===========");

		System.out.println("Enter Your Password:");
		String password = inScanner.nextLine();

		StudentService sService = new StudentService();
		boolean isValidLogin = sService.validateStudent(userEmail, password);
		if (isValidLogin) {
			System.out.println("Welcome.");

		} else {
			System.out.println("Sorry, Email or Password not matching. Try Again.");
		}

		sService.registerStudentToCourse("hluckham0@google.ru", 1);
		
		
	
//		System.out.println("==========Welcome to SchoolManagement System===========");
//		
//		StudentDAO studentDao = new StudentService();
//		CourseDAO courseDao = new CourseService();
//		
//		System.out.println("--------------Get All Students-----------");
//		studentDao.getAllStudents();
//		
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Are you a \n" + "1. Student \n" + "2.Quit" +"Please Enter 1 or 2");
//		String input = sc.nextLine();
//	
//		if(input.equals("1")) {
//			System.out.println("Enter your email : ");
//			String email = sc.nextLine();
//			
//			System.out.println("Enter your password : ");
//			String password = sc.nextLine();
//			
//			boolean valid = studentDao.validateStudent(email, password);
//			if(valid) {
//				System.out.println("Welcome");
//				studentDao.getStudentCourses(email);
//				System.out.println("1. Register to Class \n" + "2. Logout");
//				int option = sc.nextInt();
//				courseDao.getAllCourses();
//			}else {
//				System.out.println("Your credentials not matched !");
//			}
//		}else if(input.equals("2")) {
//			System.out.println("Thanks for using School Management System ");
//		}

	}

}
