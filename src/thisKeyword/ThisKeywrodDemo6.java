package thisKeyword;

class A
{
	
	public A()
	{
		B b1=new B(this);
		
	}
}

class B
{
	public B( A a1)
	{
		System.out.println("this can be passed as argument in the constructor call");
	}
}



public class ThisKeywrodDemo6 {
//this can be passed as argument in the constructor call.

	public static void main(String[] args)
	{
		A a1=new A();

	}

}
