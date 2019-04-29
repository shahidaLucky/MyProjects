package studentCourses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainRunner {

	public static void main(String[] args) {
		
		Courses c1 = new Courses(1, "Core Java");
		Courses c2 = new Courses(2, "Python");
		Courses c3 = new Courses(3, "HTML");
		
		List<Courses> l1 = new ArrayList<Courses>();
		l1.add(c2);
		l1.add(c3);
		
		Student s1 = new Student(1, "Maria", l1);
		
		s1.printStudent();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Which courses you want to drop? ");
		String dropCourse = input.nextLine();
		s1.dropCourse(dropCourse);
		

	}

}
