package sample;

import java.util.ArrayList;

public class LibraryCatalog 
{

	private ArrayList<Book> books;

	
	public LibraryCatalog() 
	{
		books = new ArrayList<>();
	}

	
	public void addBook(Book book) 
	{
		books.add(book);
		System.out.println(book.getTitle() + " by " + book.getAuthor() + " has been added to the catalog.");
	}

	
	public void searchByTitle(String title)
	{
		boolean found = false;
		for (Book book : books) 
		{
			if (book.getTitle().equalsIgnoreCase(title))
			{
				book.displayInfo();
				found = true;
			}
		}
		if (!found) 
		{
			System.out.println("No books found with the title: " + title);
		}
	}

	
	public void searchByAuthor(String author) 
	{
		boolean found = false;
		for (Book book : books) {
			if (book.getAuthor().equalsIgnoreCase(author)) 
			{
				book.displayInfo();
				found = true;
			}
		}
		if (!found)
		{
			System.out.println("No books found by the author: " + author);
		}
	}

	
	public void checkOutBook(String title)
	{
		for (Book book : books) 
		{
			if (book.getTitle().equalsIgnoreCase(title)) 
			{
				book.checkOut();
				return;
			}
		}
		System.out.println("No book with the title \"" + title + "\" is available in the catalog.");
	}

	
	public void returnBook(String title)
	{
		for (Book book : books) 
		{
			if (book.getTitle().equalsIgnoreCase(title))
			{
				book.returnBook();
				return;
			}
		}
		System.out.println("No book with the title \"" + title + "\" was found in the catalog.");
	}
}
