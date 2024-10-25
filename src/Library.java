import java.util.ArrayList;

public class Library {
	
	//  GRASP Principles: Creator, Controller
	//	Manage the catalog of books and members.
	//	Track which books are borrowed and available
	
	
	// Attributes:
	// private catalog (list of Book) 
	// private members (list of Members)

	// TODO: implement functionality of Member class
	private ArrayList<Book> catalog = new ArrayList<>();
	private ArrayList<Book> borrowedBooks = new ArrayList<>();
	private ArrayList<Member> members = new ArrayList<>();

	public Library(){
		catalog = new ArrayList<>();
		borrowedBooks = new ArrayList<>();
		members = new ArrayList<>();
	}

	public void addMember(Member member){
		if (!members.contains(member)) {
			members.add(member);
			System.out.println(member.getName() + " has joined the library");
		}
	}

	public void removeMember(Member member){
		members.remove(member);
		System.out.println(member.getName() + " has left the library");
	}

	public void addBook(Book book){
		if (!catalog.contains(book)){
			catalog.add(book);
			System.out.println(book.getName() + " has been added to the catalog.");
		}
	}

	public void removeBook(Book book){
		catalog.remove(book);
		System.out.println(book.getName() + " has been removed from the catalog.");
	}

	public void borrowBook(Member member, Book book){
		if (!borrowedBooks.contains(book)){
			member.borrowBook(book);
			borrowedBooks.add(book);
			System.out.println(member.getName() + " has borrowed the book '" + book.getName() + "'");
		}
	}

	public void returnBook(Member member, Book book){
		if (borrowedBooks.contains(book)){
			member.returnBook(book);
			System.out.println(member.getName() + " has returned the book '" + book.getName() + "'");
		}
	}

	public void getAvailableBooks(){
		System.out.println("Available Books: ");
		for (Book book : catalog){
			if (!borrowedBooks.contains(book)){
				System.out.println("	" + book.getName());
			}
		}
	}

	public void getAllMembers(){
		System.out.println("Current Library Members: ");
		for (Member member : members){
			System.out.println("	" + member);
		}
	}
}
