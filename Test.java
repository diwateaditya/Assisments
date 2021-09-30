import java.util.*;

interface Item{
	
	public void read();
	
	
	public void show();
}

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


class Dvd implements Item{
	
	String title;
	String director;
    String category;
	
	Scanner sc = new Scanner(System.in);
	
		public Dvd(){
		
	}
		public Dvd(Dvd d)
	{
		title = d.title;
		director = d.director;
		category = d.category;
	}
	public Dvd (String title, String director, String category)
	{
		this.title = title;
		this.director = director;
		this.category = category;
	}
	
	public void read(){
		System.out.println("Enter Title: ");
		title = sc.nextLine();
		
		System.out.println("Enter Director: ");
	    director = sc.nextLine();
		
		System.out.println("Enter Category: ");
		category = sc.nextLine();
		
		Dvd dvd = new Dvd(title, director, category);
		

	}
	
	public void show(){
		System.out.println("Title of Movie:- \t" + title+"\nDirector od Movie:-\t"+director+"\nCatogary of Movie:-\t"+category+"\n\n\n\n");
	}
}





public class Test{
	
	public static void main(String [] args){
	  
Scanner sc = new Scanner(System.in);
       Item it ;
	   
	   ArrayList<Item> list = new ArrayList<Item>();
	   
      int count =0;
	  
	  while(count>=0){
		System.out.println("Enter your choice for Book or DVD: Enter b for book and d for DVD");    //Choice For Book or DVD
		
		char option = sc.next().charAt(0);
		
	   if(option== 'b'){
			it= new Book();
			
			it.read();
			
			list.add(it);   			
	   }
	   
			else if(option =='d'){
				it= new Dvd();
				it.read();
			
			list.add(it); 
		
			}
			
			else {
				System.out.println("Wrong Option Entered!");
			}
     
      	 
	  
				System.out.println("Want to add another item? y/n");   // for Iteration
	  
				char choice = sc.next().charAt(0);
	  
			if(choice == 'y')
	        {
				count++;
	        }
			else if(choice == 'n')
	       {
				count =-1;
	       }
	  
	  }
			for(Item i : list){
				i.show();  // Print List
}
	}
}