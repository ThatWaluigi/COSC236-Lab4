import java.util.ArrayList;
import java.util.Random;

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

	public void addMember(String name){
		Member member = new Member(name);
		members.add(member);
		System.out.println(member.getName() + " has joined the library");
	}

	public void removeMember(Member member){
		members.remove(member);
		System.out.println(member.getName() + " has left the library");
	}

	public void addBook(Book book){
		if (!catalog.contains(book)){
			catalog.add(book);
			System.out.println(book.getTitle() + " has been added to the catalog.");
		}
	}

	public void addBook(String bookName, String author){
		Book book = new Book(bookName, author);
		catalog.add(book);
		System.out.println(book.getTitle() + " has been added to the catalog.");
	}

	public void removeBook(Book book){
		catalog.remove(book);
		System.out.println(book.getTitle() + " has been removed from the catalog.");
	}

	public void borrowBook(Member member, Book book){
		if (!borrowedBooks.contains(book)){
			member.borrowBook(book);
			borrowedBooks.add(book);
			System.out.println(member.getName() + " has borrowed the book '" + book.getTitle() + "'");
		}
	}

	public void returnBook(Member member, Book book){
		if (borrowedBooks.contains(book)){
			member.returnBook(book);
			borrowedBooks.remove(book);
			System.out.println(member.getName() + " has returned the book '" + book.getTitle() + "'");
		}
	}

	public void getAvailableBooks(){
		System.out.println("Available Books: ");
		for (Book book : catalog){
			if (!borrowedBooks.contains(book)){
				System.out.println("-	" + book);
			}
		}
	}

	public void getAllMembers(){
		System.out.println("Current Library Members: ");
		for (Member member : members){
			System.out.println("-	" + member);
		}
	}

	public Member getMemberByName(String name){
		for (Member member : members){
			if (member.getName().equals(name)){
				return member;
			}
		}
		return null;
	}
}
