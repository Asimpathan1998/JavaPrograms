package part2.GenericsAndCollections;
										//this is demo of DAO implementation
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Book {
	private static Map<String, Book> bookstore = new HashMap<String, Book>();
	
	private String isbn;
	private String titile;
	private String author;
	
	public static Map<String, Book> getBookstore() {
		return bookstore;
	}

	public static void setBookstore(Map<String, Book> bookstore) {
		Book.bookstore = bookstore;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitile() {
		return titile;
	}

	public void setTitile(String titile) {
		this.titile = titile;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Collection<Book> findAllBooks(){
		return bookstore.values();
	}
	
	public Book findBookByIsbn(String isbn) {
		return bookstore.get(isbn);
	}
	
	public void create() {
		bookstore.put(isbn, this);
	}
	
	public void delete() {
		bookstore.remove(isbn);
	}
	
	public void update() {
		bookstore.putAll(bookstore);
	}
}
