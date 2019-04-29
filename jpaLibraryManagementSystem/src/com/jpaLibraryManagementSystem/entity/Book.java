package com.jpaLibraryManagementSystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int bookId;
	private String bookName;
	private String publishYear;
	Author bookAuthor;
	
	//Constructors
	public Book() {
		
	}

	public Book(String bookName, String publishYear, Author bookAuthor) {
		super();
		this.bookName = bookName;
		this.publishYear = publishYear;
		this.bookAuthor = bookAuthor;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(String publishYear) {
		this.publishYear = publishYear;
	}

	public Author getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(Author bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	
	
	

}
