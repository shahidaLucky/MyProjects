package com.schoolManagement.services;

import java.util.ArrayList;
import java.util.List;

import javax.naming.ldap.ManageReferralControl;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.schoolManagement.entity.DepartmentManyToOne;
import com.schoolManagement.entity.DepartmentOneToMany;
import com.schoolManagement.entity.TeacherManyToOne;
import com.schoolManagement.entity.TeacherOneToMany;

public class SchoolManagementIMP implements SchoolManagementDAO {

	@Override
	public void createTeacherDepartmentManyToOne() {
		
		//creating instance of Managerfarcory and manager
		//1.
				EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("javaSchoolManagementProject");
				EntityManager entitymanager = entityManagerFactory.createEntityManager();
				
				//2.
				//insert into table employee
				entitymanager.getTransaction().begin();
				
				DepartmentManyToOne dept1 = new DepartmentManyToOne(1, "Test Department");
				entitymanager.persist(dept1);
				
				TeacherManyToOne teacher1 = new TeacherManyToOne(1, "Mike", 6000, dept1);
				entitymanager.persist(teacher1);
				
				TeacherManyToOne teacher2 = new TeacherManyToOne(2, "Barion", 8000, dept1);
				entitymanager.persist(teacher2);
				
				entitymanager.getTransaction().commit(); // commit / save/ sending record to DB
				
				//closing 
				entitymanager.close();
				entityManagerFactory.close();
			}
	
	//--------------------One to Many----------------------------

	@Override
	public void createTeacher1Department1OneTOMany() {
			//creating instance of Managerfarcory and manager
			//1.
				EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("javaSchoolManagementProject");
				EntityManager entitymanager = entityManagerFactory.createEntityManager();
				
				//2.
				//insert into table employee
				entitymanager.getTransaction().begin();
				
				TeacherOneToMany teacher1 = new TeacherOneToMany(1, "Mike", 6000);
				entitymanager.persist(teacher1);
				
				TeacherOneToMany teacher2 = new TeacherOneToMany(2, "Barion", 8000);
				entitymanager.persist(teacher2);
				
				// List
				List<TeacherOneToMany> teacherList = new ArrayList<TeacherOneToMany>();
				teacherList.add(teacher1);
				teacherList.add(teacher2);
				
				DepartmentOneToMany dept1 = new DepartmentOneToMany(1, "Test Department", teacherList);
				entitymanager.persist(dept1);
				
				entitymanager.getTransaction().commit(); // commit / save/ sending record to DB
				
				//closing 
				entitymanager.close();
				entityManagerFactory.close();
			}
		
	}
		
