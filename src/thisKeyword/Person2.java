package thisKeyword;

public class Person2
{
	//instance
	int age;
	String name;
	/*
	 * this keyword
	 * ==============
	 * To access current class instance variable and instance method we use this keyword
	 *1.this can be used to refer current class instance variable.

	 */
	
	//constructor(call=1)
	public Person2(int age,String name)//local
	{
		//same variable to assign
		System.out.println("Constructor used to initialize object");
		//local=local
		this.age=age;//The assignment to variable age has no effect
		this.name=name;
		//instance=local
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
		
		Person2 p1=new Person2(10,"Jay");
		p1.personDetails();
		
		//inside main() we cant call this keyword
		

	}

}
