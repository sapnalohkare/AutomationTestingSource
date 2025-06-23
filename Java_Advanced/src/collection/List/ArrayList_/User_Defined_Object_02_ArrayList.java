package collection.List.ArrayList_;

import java.util.ArrayList;
import java.util.Iterator;

public class User_Defined_Object_02_ArrayList {

	public static void main(String[] args) 
	{
		Book b1 = new Book("Maths", "J P Narda", 400, 2015);
		Book b2 = new Book("Java", "RamaKrishanan", 1000, 2017);
		Book b3 = new Book(".Net", "Shilpa Prabhu", 500, 2018);
		
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(b3);
		books.add(b2);
		books.add(b1);
		
		Iterator<Book> itr= books.iterator();
	
		
		while (itr.hasNext()) 
		{
			Book book = (Book) itr.next();
			System.out.println(book.name+" : "+book.author+" : "+book.pages+" : "+book.published_Year);
			
		}

	}

}


class Book
{
	String name,author;
	int pages,published_Year;
	
	Book(String name, String author, int pages, int published_Year)
	{
		
		this.name = name;
		this.author = author;
		this.pages = pages;
		this.published_Year = published_Year;
		
		
		}


}