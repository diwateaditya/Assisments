class Person{  

    public String name;
    public String surname;


    public Person(){
		
	}

    public Person(String name, String surname){

    this.name = name;
    this.surname = surname; 

    }

    public Person(Person p)
    {
       name = p.name;
       surname = p.surname;
    }

    public void show(){
      System.out.println("Name :-" + name + "    Surname:- " + surname);
    }
}

class ContactInfo extends Person{

    protected String phone;


    public ContactInfo(){
     phone ="";
    }

    public ContactInfo(String phone, String name, String surname){

    super(name,surname);
    this.phone = phone;

    }

    public ContactInfo(ContactInfo cont)
    {
      super(cont);
    phone = cont.phone;
    }

    public void show(){
       super.show();
      System.out.println("Phone = "+ phone);
    }
}

class Employee extends ContactInfo{

    private int salary;


    public Employee(){

     salary =0;
    }

    public Employee(int salary, String phone, String name, String surname){

    super(phone,name,surname);
    this.salary = salary;

    }

    public Employee(Employee emp)
    {
      super(emp);
      salary = emp.salary;
    }

    public void show(int salary){
      super.show();
      this.salary=salary;
      System.out.println("Salary = "+ salary +"\n");
    }
}

public class Office{
    
    public static void main(String [] args){


    Employee emp1 = new Employee();
    emp1.show();
    Employee emp2 = new Employee(101,"7020515342","Aditya", "Diwate");
    emp2.show();
    Employee emp3 = new Employee(emp2);
    emp3.show();
     Employee emp4 = new Employee(201,"7050344565","Aditya", "Aryan");
    emp4.show();
    Employee emp5 = new Employee(emp4);
    emp5.show();
        
     }

}