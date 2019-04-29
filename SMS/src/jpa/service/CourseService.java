package jpa.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import jpa.dao.CourseDAO;
import jpa.entitymodels.Course;

public class CourseService implements CourseDAO {
	

	@Override
	public List<Course> getAllCourses() {

		// Step-1
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SMS");
		EntityManager entityManager = emf.createEntityManager();

		// step-2
		Query query = entityManager.createQuery("SELECT course  FROM Course course");

		List<Course> courseList = query.getResultList();

		for (Course course : courseList) {
			System.out.println(course.toString());
		}
		
		//Closing
		entityManager.close();
		emf.close();

		return courseList;
	}

}
