import java.util.Scanner;

public class Main 
{
   public static void main(String[] args)
   {
	   Scanner sc = new Scanner(System.in);
	   Library library = new Library();
	   int choice;
	   
	   do 
	   {
		   System.out.println("\n======  Library Menu  =======");
		   System.out.println("1. Add Book");
		   System.out.println("2. View Books");
		   System.out.println("3. Issue Book");
		   System.out.println("4. Return Book");
		   System.out.println("5. Exit");
		   
		   System.out.println("Enter Choice: ");
		   choice = sc.nextInt();
		   sc.nextLine();
		   
		   switch(choice)
		   {
		   case 1:
			   System.out.println("Enter Book ID: ");
			   int id =sc.nextInt();
			   sc.nextLine();
			   
			   System.out.println("Enter Book Title: ");
			   String title = sc.nextLine();
			   
			   System.out.println("Enter Author Name: ");
			   String author = sc.nextLine();
			   
			   library.addBook(new Book(id, title, author));
			   
			   break;
			   
		   case 2:
			   System.out.println("\n======= Available Books =======");
			   library.viewBook();
			   break;
			   
		   case 3:
			   System.out.println("Enter Book ID to Issue: ");
			   int issueId = sc.nextInt();
			   library.returnBook(issueId);
			   break;
			   
		   case 4:
			   System.out.println("Enter Book Id to Return: ");
			   int returnId = sc.nextInt();
			   library.returnBook(returnId);
			   break;
			   
		   case 5:
			   System.out.println("Exiting Library System....");
			   System.out.println("Thnak You");
			   break;
			   
			   default:
				   System.out.println("Invaild Choice. Please try again.");
		   }
	   }
	   while(choice !=5);
	   sc.close();
   }
}
