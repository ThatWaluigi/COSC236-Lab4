import java.util.ArrayList;

public class Member {

	// GRASP Principle: Information Expert and Low Coupling
	// Can borrow and return books.

	private String name;
	private int memberId;
	private ArrayList<Book> borrowedBooks;
	// private borrowedbBooks DONE: implement collection of borrowed books
	
	// DONE: implement functionality of Member class
	public Member(String name, int memberId) {
		this.name = name;
		this.memberId = memberId;
	}
	public void borrowBook(Book book) {
		if(book.isAvailable()) {
			borrowedBooks.add(book);
			book.setIsAvailable(false);
		}else {
			System.out.println("Book is not available!");
		}
	}
	public Book returnBook(Book book) {
		if(borrowedBooks.contains(book)) {
			borrowedBooks.remove(book);
			book.setIsAvailable(true);
			return book;
		}else {
			System.out.println("Book is not borrowed by this person!");
			return null;
		}
	}
	public String getName() {
		return this.name;
	}
}
