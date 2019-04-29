package com.lucky.libraryManagement.service;

import java.util.List;

import com.lucky.libraryManagement.dao.BookDao;
import com.lucky.libraryManagement.model.Book;

public class BookService {
	private static BookDao bookDao;

	public BookService() {
		bookDao = new BookDao();
	}

	public void persist(Book entity) {
		bookDao.openCurrentSessionWithTransaction();
		bookDao.persist(entity);
		bookDao.closeCurrentSessionWithTransaction();
	}

	public void update(Book entiry) {
		bookDao.openCurrentSessionWithTransaction();
		bookDao.update(entiry);
		bookDao.closeCurrentSessionWithTransaction();
	}

	public Book findById(String id) {
		bookDao.openCurrentSession();
		Book book = bookDao.findById(id);
		bookDao.closeCurrentSession();
		return book;
	}

	public void delete(String id) {
		bookDao.openCurrentSessionWithTransaction();
		Book book = bookDao.findById(id);
		bookDao.delete(book);
		bookDao.closeCurrentSessionWithTransaction();
	}

	public List<Book> findAll() {
		bookDao.openCurrentSession();
		List<Book> books = bookDao.findAll();
		bookDao.closeCurrentSession();
		return books;
	}

	public void deleteAll() {
		bookDao.openCurrentSessionWithTransaction();
		bookDao.deleteAll();
		bookDao.closeCurrentSessionWithTransaction();
	}

	public BookDao bookDao() {
		return bookDao;
	}
}
