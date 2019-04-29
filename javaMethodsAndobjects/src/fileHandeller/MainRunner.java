package fileHandeller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.sampled.Line;

public class MainRunner {

	public static void main(String[] args) {
		System.out.println("************* Using data **************");
//		try {
//			String location = "D:\\Users\\shahida.lucky\\eclipse-workspace\\javaMethodsAndobjects\\src\\fileHandeller\\hello.txt";
//			File file = new File(location);
//			Scanner input = new Scanner(file);
//			String data ="";
//			while(input.hasNextLine()) {
//				data += input.hasNextLine();
//			}
//			System.out.println(data);
//			String line = input.nextLine();
//			System.out.println(line);
//		} catch (FileNotFoundException e) {
//			// TODO: handle exception
//			System.out.println("File not found! ");
//			// e.printStackTrace();
//		}
//-----------------------------------------------------
		String location = "D:\\Users\\shahida.lucky\\eclipse-workspace\\javaMethodsAndobjects\\src\\fileHandeller\\hello.txt";
		
		ArrayList<Employee> empList = MyFileReader.fileReader(location);
		// print
		for (Employee emp : empList) {
			// System.out.println(line);
			System.out.println(emp.toString());
//			for(String token: line) {
//				System.out.println(token + "|");
//			}
//			System.out.println();
		}
		Employee emp1 = new Employee(003, "Tom", "San Jose");
		Employee emp2 = new Employee(004, "Lucy", "San Jose");
		Employee emp3 = new Employee(005, "David", "San Jose");
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		MyFileWriter.fileWrite(location, empList);
		
		
	}
}
