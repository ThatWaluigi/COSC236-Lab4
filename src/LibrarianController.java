import java.util.ArrayList;

public class LibrarianController {

	// GRASP Principle: Controller
	// Handles user requests like borrowing and returning books.
	// Delegates tasks to the appropriate objects.
	
	// TODO: implement functionality of Member class
	private Member member; 
	private ArrayList<Book> books;
	
	public LibrarianController() { 
		this.member = member;
		this.books = new ArrayList<>();
	}
	
	public void BorrowBook(String name,  Book book) { 
		Member member = new Member(name);
		if(book.isAvailable()) { 
			member.borrowBook(book);
		}
		
	}
}
