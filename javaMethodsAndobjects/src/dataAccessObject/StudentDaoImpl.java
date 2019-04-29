package dataAccessObject;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
	// List is working as database
	List<Student> students;
	
	public StudentDaoImpl() {
		students = new ArrayList<Student>();
		Student student1 = new Student("Robert", 0);
		Student student2 = new Student("John", 1);
		students.add(student1);
		students.add(student2);
	}

	//retrive List of students from the database
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return students;
	}

	@Override
	public Student getStudent(int rollNo) {
		Student lookUpStudent= students.get(rollNo);
		return lookUpStudent;
	}

	@Override
	public void updateStudent(Student student, String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent(int rollNo) {
		// TODO Auto-generated method stub
		
	}

}
