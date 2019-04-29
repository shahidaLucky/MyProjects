package dataAccessObject;

import java.util.List;

public interface StudentDao {
	
	public static List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}
	public StudentDao getStudent(int rollNo);
	
	public void updateStudent(Student student, String name);
	public void deleteStudent(int rollNo);

}
