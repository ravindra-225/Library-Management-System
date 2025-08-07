package com.example.library.main;

import java.util.Scanner;

import com.example.library.models.Book;
import com.example.library.models.User;
import com.example.library.service.Library;

public class Main {
	public static void main(String[] args) {
		Library library = new Library();
		
		library.addBook(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", "English", "Fiction", 1925));
		library.addBook(new Book(2, "1984", "George Orwell", "English", "Dystopian", 1949));
		library.addBook(new Book(3, "To Kill a Mockingbird", "Harper Lee", "English", "Classic", 1960));
		library.addBook(new Book(4, "Cien años de soledad", "Gabriel García Márquez", "Spanish", "Magical Realism", 1967));
		
		library.addUser(new User(101, "Alice Johnson", 9876543210L));
		library.addUser(new User(102, "Bob Smith", 8765432109L));
		library.addUser(new User(103, "Charlie Davis", 7654321098L));
		library.addUser(new User(104, "Diana Prince", 6543210987L));
		
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		while(running) {
			System.out.println("\nLibrary Management System");
	        System.out.println("1. Display all books");
	        System.out.println("2. Display all users");
	        System.out.println("3. Add a book");
	        System.out.println("4. Add a user");
	        System.out.println("5. Issue a book");
	        System.out.println("6. Return a book");
	        System.out.println("7. Exit");
	        System.out.print("Choose an option: ");
	        
	        int choice = sc.nextInt();
	         switch (choice) {
	         case 1:
	        	 library.getAllBooks();
	        	 break;
	         case 2: 
	        	 library.getAllUsers();
	        	 break;
	        	  
	         case 3:
	        	 library.addBook();
	        	 
	        	 break;
	         
	         case 4:
	        	 library.addUser();
	        	 break;
	         case 5:
	        	 library.issueBook();
	        	 break;
	         case 6: 
	        	 library.returnBook();
	        	 break;
	         case 7:
	        	 System.out.println("Exiting the system...!");
	        	 running = false;
	        	 break;
	        default: 
	        	System.out.println("Invalid option. Please enter valid option");
	         } 
	        
		}
		sc.close();
	}

}
