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
		Member member = library.getMemberByName(memberName);
		Book book = library.getBookByName(title);
		library.borrowBook(member, book);
	}
	
	public void returnBook(String memberName, String title) { 
		Member member = library.getMemberByName(memberName);
		Book book = library.getBookByName(title);
		library.returnBook(member, book);
	}
	
	public void addMember(String name) { 
		library.addMember(name);
	}
	
	public void removeMember(String name) { 
		Member member = library.getMemberByName(name);
		library.removeMember(member);
	}
	
	public void addBook(String title, String author) { 
		Book book = new Book(title, author);
		library.addBook(book);
	}
	
	public void removeBook(String title) { 
		Book book = library.getBookByName(title);
		library.removeBook(book);
	}
}
