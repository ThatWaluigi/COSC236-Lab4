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
		//method to see if It's available
		public boolean isAvailable() {
			return true;
		}
		
		public void borrow() {
			if(isAvailable) {
				isAvailable = false;
				
			}
		}
	
	
}
