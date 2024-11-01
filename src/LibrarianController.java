import java.util.ArrayList;

public class LibrarianController {

	// GRASP Principle: Controller
	// Handles user requests like borrowing and returning books.
	// Delegates tasks to the appropriate objects.
	
	// TODO: implement functionality of Member class
	private Library library;
	
	public LibrarianController() { 
		this.library = new Library();
	}
	
	public void borrowBook(String memberName,  String title) { 
		library.borrowBook(memberName, title);
	}
	
	public void returnBook(String memberName, String title) { 
		library.returnBook(memberName, title);
	}
	
	public void addMember(String name) { 
		library.addMember(name);
	}
	
	public void removeMember(String name) { 
		library.removeMember(name);
	}
	
	public void addBook(String title, String author) { 
		library.addBook(title, author);
	}
	
	public void removeBook(String title) { 
		library.removeBook(title);
	}
	
	public void getAvailableBooks() { 
		library.getAvailableBooks();
	}
	
	public void getAllMembers() { 
		library.getAllMembers();
	}
}
