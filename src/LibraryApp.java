//Simplified verion of Library Management System

import java.util.ArrayList;
import java.util.HashMap;

public class LibraryApp {
  
public static void main(String[] args) {
     LibrarianController controller = new LibrarianController();
     System.out.println(" *** Library management system demo *** ");
	 
    // Adding some books to the catalog
	//System.out.println("\n *** Adding \"Dune\" to the library:");
	controller.addBook("Dune", "Frank Herbert");
	
	//System.out.println("\n *** Adding \"1984\" to the library:");
	controller.addBook("1984", "George Orwell");
	
	//System.out.println("\n *** Adding \"Moby Dick\" to the library:");
    controller.addBook("Moby Dick", "Herman Melville");

    // Show available books
    controller.getAvailableBooks();
    
    // Adding members
    //System.out.println("\n *** Adding \"Alice\" to the library members");
    controller.addMember("Alice");
    
    //System.out.println("\n *** Adding \"Bob\" to the library members");
    controller.addMember("Bob");

    // Show members
    controller.getAllMembers();
    
    // Borrow a book
    //System.out.println("\n *** Alice borrows Dune:");
    controller.borrowBook("Alice", "Dune");

    // Show available books after borrowing
    controller.getAvailableBooks();

    //System.out.println("\n *** Bob borrows 1984:");
    controller.borrowBook("Bob", "1984");
    
    controller.getBorrowedBooks();
    
    // Show available books after borrowing
    controller.getAvailableBooks();
    
    //System.out.println("\nBob borrows Dune:");
    controller.borrowBook("Bob", "Dune");
    
    // Show available books after borrowing
    controller.getAvailableBooks();
    
    // Return a book
    //System.out.println("\n *** Alice returns Dune:");
    controller.returnBook("Alice", "Dune");

    // Show available books after returning
    controller.getAvailableBooks();

    //System.out.println("\n *** Bob borrows Dune:") ;
    controller.borrowBook("Bob", "Dune");
    
    // Show available books after borrowing
    controller.getAvailableBooks();
    
    System.out.println(controller.getMemberByName("Alice"));
    
    System.out.println(controller.getBookByTitle("Dune"));
    
    controller.getBorrowedBooks();

	}
}