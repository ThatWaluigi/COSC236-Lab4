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
	
	public void borrowBook(String memberName,  String bookName) { 
		Member member = library.getMemberByName(memberName);
		Book book = library.getBookByName(bookName);
		library.borrowBook(member, book);
	}
	
	public void returnBook(String memberName, String bookName) { 
		Member member = library.getMemberByName(memberName);
		Book book = library.getBookByName(bookName);
		library.returnBook(member, book);
	}
}
