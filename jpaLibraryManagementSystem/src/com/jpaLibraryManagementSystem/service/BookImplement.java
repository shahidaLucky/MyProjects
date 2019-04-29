package com.jpaLibraryManagementSystem.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jpaLibraryManagementSystem.entity.Author;
import com.jpaLibraryManagementSystem.entity.Book;

public class BookImplement implements BookDAO {

	@Override
	public List<Book> getAllBooks() {
		// step-1
		EntityManagerFactory entityManagerFactory = Persistence
				.createEntityManagerFactory("jpaLibraryManagementSystem");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		// create query HQL
		Query queryBooks = entityManager.createQuery("SELECT book FROM Book book ");
		List<Book> books = queryBooks.getResultList();
		return books;
	}

	@Override
	public void saveBook(String bookName, String year, String authorName) {
	// step 1	
     EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpaLibraryManagementSystem");
     EntityManager entityManager = entityManagerFactory.createEntityManager();
     
     entityManager.getTransaction().begin();
     Author author = new Author(103, authorName);
     entityManager.persist(author);
          
     //step 2
     Book book = new Book(bookName, year, author);
     entityManager.persist(book);
     entityManager.getTransaction().commit();
	}

}
