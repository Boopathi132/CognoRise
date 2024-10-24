package sample;

public class Main
{

	public static void main(String[] args) 
	{
		
		LibraryCatalog catalog = new LibraryCatalog();

		
		Book book1 = new Book("2021", "Thibaut Meurissee");
		Book book2 = new Book("A Short Guide to Remove Distractions", " Lee");
		catalog.addBook(book1);
		catalog.addBook(book2);

		
		catalog.searchByTitle("2021");

		
		catalog.checkOutBook("2021");

		
		catalog.checkOutBook("2021");

		
		catalog.returnBook("2021");

		
		catalog.searchByAuthor(" Lee");
	}
}
