import java.util.*;
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