package fileHandeller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyFileReader {

	public static  ArrayList<Employee> fileReader(String location) {
		
		ArrayList<Employee> empList = new ArrayList<Employee>() ;
		
		try {

			File file = new File(location);
			Scanner input = new Scanner(file);

			// sorting
			input.nextLine();
			String line;
			while (input.hasNextLine()) {
				line = input.nextLine();
				if (!line.equals("")) {
					String[] lineArr = line.split(",");
					empList.add(new Employee(Integer.parseInt(lineArr[0]), lineArr[1], lineArr[2]));
					// data.add(input.nextLine());
				}
			}

		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("File not found! ");
			// e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Please check the ID format in the file !");

		}
		return empList;
	}
}
