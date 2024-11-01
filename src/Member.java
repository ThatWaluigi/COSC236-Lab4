import java.util.ArrayList;

public class Member {

	// GRASP Principle: Information Expert and Low Coupling
	// Can borrow and return books.

	private String name;
	private ArrayList<Book> borrowedBooks;
	// private borrowedbBooks DONE: implement collection of borrowed books
	
	// DONE: implement functionality of Member class
	public Member(String name) {
		this.name = name;
		this.borrowedBooks = new ArrayList<>();
	}

	public void borrowBook(Book book) {
		if(book.isAvailable()) {
			borrowedBooks.add(book);
			book.setIsAvailable(false);
		}else {
			System.out.println("Book is not available!");
		}
	}
	public void returnBook(Book book) {
		if(borrowedBooks.contains(book)) {
			borrowedBooks.remove(book);
			book.setIsAvailable(true);
		}
		else {
			System.out.println("Book is not borrowed by this person!");
		}
	}
	public String getName() {
		return this.name;
	}

	public boolean hasBorrowedBook(Book book){
		return borrowedBooks.contains(book);
	}

	@Override
	public String toString() {
		return "Member: " + getName();
	}
}
