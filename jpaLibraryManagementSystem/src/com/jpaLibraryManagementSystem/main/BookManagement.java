package com.jpaLibraryManagementSystem.main;

import java.util.List;
import java.util.Scanner;

import javax.persistence.Id;

import com.jpaLibraryManagementSystem.entity.Book;
import com.jpaLibraryManagementSystem.service.BookImplement;

public class BookManagement {

	public void printMainMenu() {
		System.out.println("Welcome to our Book Library!");
		System.out.println("Choose from list-");
		System.out.println("1. Get all books:  ");
		System.out.println("2. Get book by Id:  ");
		System.out.println("3. Save book :  ");

		Scanner inScanner = new Scanner(System.in);
		int choice = inScanner.nextInt();
		
		switch (choice) {
		case 1:
			getAllBooks();
			break;
		case 2:
			getBookById();
			break;
		case 3:
			saveBook();
			break;

		default:
			break;
		}


	}
	public void getAllBooks() {
		System.out.println("Calling getAllBooks");
		System.out.println("All books:" );
		BookImplement booksBookImplement = new BookImplement();
		List<Book> books = booksBookImplement.getAllBooks();
	}
	
	public void getBookById() {
		System.out.println("Book by id");
	}
	
	public void saveBook() {
		Scanner input = new Scanner(System.in);
//		System.out.println("Enter bookId: ");
//		int id = input.nextInt();
//		input.nextLine();
		System.out.println("Enter Book Name:");
		String bookName =  input.nextLine();
		System.out.println("Enter publish year: ");
		String year = input.nextLine();
		System.out.println("Enter Author:");
		String author =  input.nextLine();
		
		BookImplement bookImplement = new BookImplement();
		bookImplement.saveBook(bookName, year, author);
//		Book book1 = new Book();
		
	}

	
	
}
