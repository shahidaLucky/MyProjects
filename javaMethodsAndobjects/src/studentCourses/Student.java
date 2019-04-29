package studentCourses;

import java.util.List;

public class Student {

	int sId;
	String sName;
	List<Courses> sCourses;

	public Student(int sId, String sName, List<Courses> sCourses) {
		this.sId = sId;
		this.sName = sName;
		this.sCourses = sCourses;
	}

	void dropCourse(String dropCourse) {

		for (int i = 0; i < sCourses.size(); i++) {
			System.out.println("for: " + sCourses.get(i).cName);
			if (sCourses.get(i).cName.equals(dropCourse)) {
				sCourses.remove(sCourses.get(i));
				break;
			} else {
				System.out.println("The course you are trying to drop is not in your list ! ");
			}
		}
	}

	// method to print
	void printStudent() {
		System.out.println("The student ID is :" + sId);
		System.out.println("The name is : " + sName);
		for (Courses courses : sCourses) { // enhance for loop
			System.out.println("The courses taken are : " + courses.cName);
		}

	}
}
