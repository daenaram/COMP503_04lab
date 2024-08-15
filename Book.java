import java.lang.reflect.*;
public class Book {
	
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book = new Book("Pride and Prejudice", "Jane Austen");
		
		System.out.println("title = " + book.getTitle());
        System.out.println("author = " + book.getAuthor());
 

	}

}
