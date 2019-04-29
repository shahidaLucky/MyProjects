package com.jpaLibraryManagementSystem.service;

import java.util.List;

import com.jpaLibraryManagementSystem.entity.Book;

public interface BookDAO {
 
	public List<Book> getAllBooks();
	public void saveBook( String bookName, String year, String authorName);

}
