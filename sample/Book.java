package sample;

public class Book
{

	private String title;
	private String author;
	private boolean isAvailable;

	
	public Book(String title, String author) 
	{
		this.title = title;
		this.author = author;
		this.isAvailable = true; 
	}

	
	public String getTitle()
	{
		return title;
	}

	public String getAuthor() 
	{
		return author;
	}

	public boolean isAvailable()
	{
		return isAvailable;
	}

	
	public void checkOut() 
	{
		if (isAvailable) 
		{
			isAvailable = false;
			System.out.println(title + " has been checked out.");
		} 
		else 
		{
			System.out.println(title + " is currently unavailable.");
		}
	}

	
	public void returnBook()
	{
		if (!isAvailable) 
		{
			isAvailable = true;
			System.out.println(title + " has been returned and is now available.");
		} 
		else
		{
			System.out.println(title + " is already available.");
		}
	}

	
	public void displayInfo()
	{
		String status = isAvailable ? "Available" : "Checked out";
		System.out.println("Title: " + title + ", Author: " + author + ", Status: " + status);
	}
}
