import java.util.ArrayList;

public class Library 
{
  ArrayList<Book> books = new ArrayList<Book>();
   
  public  void addBook(Book book)
  {
	  books.add(book);
	  System.out.println("Book Added Successfully!");
  }
  
  public void viewBook()
  {
	  if(books.isEmpty())
	  {
		System.out.println("No books available.");  
	  }
	  for(Book book : books)
	  {
		  book.displayBook();
	  }
  }
  
  public void isssueBook(int id)
  {
	  for(Book book : books)
	  {
		  if(book.id == id)
		  {
			  if(!book.isIssued)
			  {
				  book.isIssued = true;
				  System.out.println("Book Issued Successfully.");
			  }
			  else
			  {
				  System.out.println("Book already issued.");
			  }
			  return;
		  }
	  }
	  System.out.println("Books not found.");
  }
  
  public void returnBook(int id)
  {
	  for(Book book : books)
	  {
		  if(book.id == id)
		  {
			  if(book.isIssued)
			  {
				  book.isIssued = false;
				  System.out.println("Book Returned Succesfully!");
			  }
			  else
			  {
				  System.out.println("Book not issued");
			  }
			  return;
		  }
	  }
	  System.out.println("Book not found.");
  }
}
