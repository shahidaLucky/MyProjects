package ExerciseFileReader;

import java.util.ArrayList;

import fileHandeller.Employee;
import fileHandeller.MyFileReader;
import fileHandeller.MyFileWriter;

public class MainRunnerFileIO {

	public static void main(String[] args) {
		
		String location = "D:\\Users\\shahida.lucky\\eclipse-workspace\\javaMethodsAndobjects\\src\\ExerciseFileReader\\credential.txt";

		ArrayList<User> userList = MyFileReader.fileReader(location);
		for (User user :userList) {
			// System.out.println(line);
			System.out.println(user.toString());

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
