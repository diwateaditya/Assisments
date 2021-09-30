import java.util.*;
class Book implements Item{
	
	Scanner sc = new Scanner(System.in);
	String name;
	String author;
    String publication;
	
	public Book(){
		
	}
		public Book(Book b){
		name = b.name;
		author = b.author;
		publication = b.publication;
	}
	
	public Book(String name, String author, String publication)
	{
		this.name = name;
		this.author = author;
		this.publication = publication;
	}
	
	public void read(){
		System.out.println("Enter Book Name: ");
		name = sc.nextLine();
		
		System.out.println("Enter Author Name: ");
	    author = sc.nextLine();
		
		System.out.println("Enter Publication: ");
		publication = sc.nextLine();
		
		Book book = new Book(name, author, publication);

	}
	
	public void show(){
		System.out.println("Name of Book:-" + name+"\nAuthor of Book:-`"+author+"\nPublicationof Book:-"+publication+"\n\n");
	}
}