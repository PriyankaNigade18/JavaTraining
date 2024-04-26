package thisKeyword;

public class Person
{
	//instance
	int age;
	String name;
	
	
	//constructor(call=1)
	public Person(int a,String n)//local
	{
		//different variable to assign
		System.out.println("Constructor used to initialize object");
		//instance=local
		age=a;
		name=n;
	}
	
	//method(Business logic)(call-2)
	public void personDetails()
	{
		System.out.println("Person age is: "+age);
		System.out.println("Person name is: "+name);
	}
	
	

	public static void main(String[] args)
	{
		// Call member of a class create Object		
		
		Person p1=new Person(10,"Jay");
		p1.personDetails();
		

	}

}
