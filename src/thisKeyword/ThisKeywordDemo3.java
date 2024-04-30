package thisKeyword;

public class ThisKeywordDemo3
{
	//this() can be used to invoke current class constructor.

	int  id=101;//instance
	
	String name="Kiran";
	public ThisKeywordDemo3()
	{
		//this can be passed as argument in the constructor call.
		
		//this(201);//calling parameterized constructor
		System.out.println("This is default constructor");
	}
	
	public ThisKeywordDemo3(String name)
	{
		
		this.name=name;
		System.out.println("name: "+name);
	}
	
	public ThisKeywordDemo3(int id)//local
	{
		
		//this();
		this.id=id;
		//this(this.id)
		System.out.println("This is parameterized constructor: id is: "+this.id);
		//this();//Constructor call must be the first statement in a constructor
		
	}
	

	public static void main(String[] args)
	{

		ThisKeywordDemo3 t1=new ThisKeywordDemo3();
		

	}

}
