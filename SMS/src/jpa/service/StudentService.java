package jpa.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public class StudentService implements StudentDAO {

	@Override
	public List<Student> getAllStudents() {
		// Step-1
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SMS");
		EntityManager entityManager = emf.createEntityManager();
		try {
			// step-2
			Query query = entityManager.createQuery("SELECT student FROM student");

			List<Student> studentsList = query.getResultList();

			for (Student student : studentsList) {
				System.out.println(student.toString());
			}
		} catch (Exception e) {
			System.out.println("Somethignwent wrong   !!!!!!!!Error!");
		}

		// Closing
		entityManager.close();
		emf.close();
		return null;

		// return studentsList;
	}

	@Override
	public Student getStudentByEmail(String email) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SMS");
		EntityManager entityManager = emf.createEntityManager();

		Student studentEmail = entityManager.find(Student.class, email);
		if (studentEmail.equals(email)) {
			System.out.println(studentEmail.toString());
		} else {
			System.out.println("This student email is not exsist !");
		}
		// Closing
		entityManager.close();
		emf.close();
		return studentEmail;

	}

	@Override
	public boolean validateStudent(String sEmail, String sPassword) {

		// setp-1 
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SMS");
		EntityManager entityManager = emf.createEntityManager();
		
		Student  emailStudent = entityManager.find(Student.class, sEmail);
		Student passStudent = entityManager.find(Student.class, sPassword);
		
		Query validateQuery = entityManager.createQuery(
				"SELECT student FROM Student student WHERE student.email= :sEmail ");
		validateQuery.setParameter("givenEmail", sEmail);
		List<Course> employeeList = validateQuery.getResultList();// finding the list of the courses
		//validateQuery.setParameter("givenPass", sPassword);

		System.out.println(employeeList.toString());
		if (validateQuery != null) {
			System.out.println("Student Found! ");
			return true;
		} else {
			System.out.println("Not Found! ");
		}

		Student studentVerify = entityManager.find(Student.class, sEmail);
		studentVerify.setsEmail(sEmail);
		studentVerify.setPassword(sPassword);

		// Closing
		entityManager.close();
		emf.close();

		return false;
	}

	@Override
	public void registerStudentToCourse(String sEmail, int cId) {
		

	}

	@Override
	public List<Course> getStudentCourses(String sEmail) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SMS");
		EntityManager entityManager = emf.createEntityManager();

		Student student = entityManager.find(Student.class, sEmail);
	
		
		// Closing
		entityManager.close();
		emf.close();
		return null;

	}

}
