package fileHandeller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;

public class MyFileWriter {

	public static void fileWrite(String location, ArrayList<Employee> empList) {
		try {
			File file = new File(location);
			FileWriter writer = new FileWriter(file, true);
			writer.write("I'm the third employee");
		} catch (IOException e) {
			System.out.println("File not found! ");
		}
	}
}
