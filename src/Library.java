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
	private ArrayList<Member> members = new ArrayList<>();

	public Library(){
		catalog = new ArrayList<>();
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

	public void removeMember(String memberName){
		Member member = getMemberByName(memberName);
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

	public void removeBook(String bookName){
		Book book = getBookByTitle(bookName);
		catalog.remove(book);
		System.out.println(book.getTitle() + " has been removed from the catalog.");
	}

	public Book getBookByTitle(String title){
		for (Book book : catalog){
			if (book.getTitle().equals(title)){
				return book;
			}
		}
		return null;
	}

	public void borrowBook(Member member, Book book){
		if (book.isAvailable()){
			member.borrowBook(book);
			book.setIsAvailable(false);
			System.out.println(member.getName() + " has borrowed the book '" + book.getTitle() + "'");
		}
		else
		{
			System.out.println(book.getTitle() + " has already been borrowed.");
		}
	}

	public void borrowBook(String memberName, String bookTitle){
		Book book = getBookByTitle(bookTitle);
		Member member = getMemberByName(memberName);
		if (book.isAvailable()){
			member.borrowBook(book);
			book.setIsAvailable(false);
			System.out.println(member.getName() + " has borrowed the book '" + book.getTitle() + "'");
		}
		else
		{
			System.out.println(book.getTitle() + " has already been borrowed.");
		}
	}

	public void returnBook(Member member, Book book){
		if (!book.isAvailable()){
			member.returnBook(book);
			book.setIsAvailable(true);
			System.out.println(member.getName() + " has returned the book '" + book.getTitle() + "'");
		}
	}

	public void returnBook(String memberName, String bookTitle){
		Book book = getBookByTitle(bookTitle);
		Member member = getMemberByName(memberName);
		if (!book.isAvailable()){
			member.returnBook(book);
			book.setIsAvailable(true);
			System.out.println(member.getName() + " has returned the book '" + book.getTitle() + "'");
		}
	}

	public void getAvailableBooks(){
		System.out.println("Available Books: ");
		for (Book book : catalog){
			if (book.isAvailable()){
				System.out.println("-	" + book);
			}
		}
	}

	public void getBorrowBooks(){
		System.out.println("Borrowed Books: ");
		for (Book book : catalog){
			if (!book.isAvailable()){
				Member member = null;
				for (Member mem : members){
					if (mem.hasBorrowedBook(book)){
						member = mem;
						break;
					}
				}
				System.out.println("-	" + book + " borrowed by " + member);
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
