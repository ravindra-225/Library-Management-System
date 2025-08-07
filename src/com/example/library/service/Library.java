package com.example.library.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.example.library.models.Book;
import com.example.library.models.User;

public class Library {
	
	private ArrayList<Book> books = new ArrayList<>();
	private ArrayList<User> users = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public void addBook() {
	    System.out.print("Enter book title: ");
	    String title = sc.nextLine();
	    System.out.print("Enter author: ");
	    String author = sc.nextLine();
	    System.out.print("Enter bookid: ");
	    int bookid = sc.nextInt();
		 for (Book book : books) {
		        if (book.getBookid() == bookid) {
		            System.out.println("Book ID already exists. Please use a unique Book ID.");
		            return;
		        }
		    }
		 
	    System.out.print("Enter language: ");
	    sc.next();
	    String language = sc.nextLine();
	    System.out.print("Enter category: ");
	    String category = sc.nextLine();
	    System.out.print("Enter year: ");
	    int year = sc.nextInt();

	    books.add(new Book( bookid, title, author, language, category, year));
	    System.out.println("New book added successfully");
	}
	public void addUser(User user) {
		users.add(user);
	}
	
	public void addUser() {
		System.out.println("Enter UserId: ");
		int userid = sc.nextInt();
		sc.nextLine();
		
		 for (User u : users) {
		        if (u.getUserid() == userid) {
		            System.out.println("User ID already exists. Please use a unique User ID.");
		            return;
		        }
		    }
		 
		System.out.println("Enter  User Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Phone Number: ");
		Long phone = sc.nextLong();
		for (User u : users) {
	        if (u.getPhone() == phone) {
	            System.out.println("Phone number already exists. Please use a different phone number.");
	            return;
	        }
	    }
		
		users.add(new User(userid, name, phone ));
		System.out.println("New user successfully added");
		}
	
	public boolean issueBook() {
		System.out.println("Enter bookid of the book to issue: ");
		int bookid = sc.nextInt();
		Book book =findBookById(bookid);
		if (book == null) {
			System.out.println("Book ID does not exist. Please enter a valid Book ID.");
	        return false;
		}
		if (!book.isAvailable()) {
	        System.out.println("Book is currently not available.");
	        return false;
	    }
	    
		System.out.println("Enter User userid: ");
		int userid = sc.nextInt();
		User user = findUserById(userid);
		if (user == null) {
	        System.out.println("User ID does not exist. Please enter a valid User ID.");
	        return false;
	    }
	    if (user.getBorrowedbooks() != null) {
	        System.out.println("User has already borrowed a book.");
	        return false;
	    }
	    user.borrowBook(book);
		System.out.println("Book issued successfully to " + user.getName() + "and "+ user.getUserid()+".");
		return true;
	}
	
	public boolean returnBook() {
		
		System.out.println("Enter User userid: ");
		int userid = sc.nextInt();
		User user  = findUserById(userid);
		if (user != null && user.getBorrowedbooks()!=null) {
			user.returnBook();
			return true;
		}else {
			System.out.println("user not exits or user already borrowed");
			return false;
		}
		
	}
	
	private Book findBookById(int bookid) {
		for (Book book  : books) {
			if (book.getBookid() == bookid) {
				return book;
			}
		}
		return null;
	}
	
	private User findUserById(int userid) {
		for (User user: users) {
			if (user.getUserid() == userid) {
				return user;	
			}
		}
		return null;
	}
	
	public void getAllUsers() {
		System.out.println("\nAll Users:\n");
	    for (User user : users) {
	        System.out.println(user);
	    }
	}

	
	public void getAllBooks() {
		System.out.print("\nAll Books: \n");
	    for(Book book : books) {
	    	System.out.println(book);
	    }
	}

	
}
