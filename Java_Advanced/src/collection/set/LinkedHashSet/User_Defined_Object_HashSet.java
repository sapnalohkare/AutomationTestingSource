package collection.set.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class User_Defined_Object_HashSet {
	public static void main(String[] args) {
		
		Book b1 = new Book("Maths", "J P Narda", 400, 2015);
		Book b2 = new Book("Java", "RamaKrishanan", 1000, 2017);
		Book b3 = new Book(".Net", "Shilpa Prabhu", 500, 2018);
		Book b4 = new Book(null, null, 0, 0);

		LinkedHashSet<Book> books = new LinkedHashSet<Book>();
		books.add(b3);
		books.add(b2);
		books.add(b1);
		books.add(b4);

		Iterator<Book> itr = books.iterator();

		while (itr.hasNext()) {
			Book book = (Book) itr.next();
			System.out.println(book.name + " : " + book.author + " : " + book.pages + " : " + book.published_Year);

		}

	}

}

class Book {
	String name, author;
	int pages, published_Year;

	Book(String name, String author, int pages, int published_Year) {

		this.name = name;
		this.author = author;
		this.pages = pages;
		this.published_Year = published_Year;

	}

}
