public class Book {

	// GRASP Principle: Information Expert
	// Manages its own state (available or borrowed).
	private String title;
	private String author;
	private boolean isAvailable; 
	
	//We declare the title, author and if It's available
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.isAvailable = true;
	}
	
	
		//method so we get the title
		public String getTitle() {
			return title;
		}
		//method to get the author
		public String getAuthor() {
			return author;
		}
		//method to set availability
		public void setIsAvailable(boolean isAvailable) {
			this.isAvailable = isAvailable;
		}
		public boolean isAvailable() {
			return this.isAvailable;
		}
		
		public void borrow() {
			if(isAvailable) {
				isAvailable = false;
				
			}
		}
		public void returnBook() {
			isAvailable = true;
			
		}
		
		public void  setDetails(String author, String title) {
			this.author = author;
			this.title = title;
		}
		
		public void displayDetails() {
			System.out.println("Title: " + title + ", " + "Author: " + author);
		}
			
		
		}
	
	

