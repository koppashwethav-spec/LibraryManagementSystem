
public class Book 
{
    int id;
    String title;
    String author;
    boolean isIssued; 
    public Book(int id, String title, String author)
    {
    	this.id = id;
    	this.title =title;
    	this.author = author;
    	this.isIssued = false;
    }
public void displayBook()
  {
	System.out.println("ID: " + id);
	System.out.println("Title: " + title);
	System.out.println("Author: " + author);
	System.out.println("-----------------");
   }
}