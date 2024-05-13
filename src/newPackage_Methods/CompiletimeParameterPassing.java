package newPackage_Methods;

public class CompiletimeParameterPassing 
{
	public void add()//0 parameters
	{
		int a=10,b=20;
		System.out.println("Addition is: "+(a+b));
		
	}
	
	public void sub(int a,int b)//2 parameter a=100 b=90
	{
		System.out.println("Subtraction is: "+(a-b));
	}

	public int mul(int a,int b)//a=b=10
	{
		return a*b;
	}
	
	
	
	public static void main(String[] args)
	{
		CompiletimeParameterPassing c1=new CompiletimeParameterPassing();
		c1.add();
		/*
		 * When you pass arguments while calling any method is called compile time parameter passing!
		 */
		c1.sub(100,90);
		
		int res=c1.mul(10,10);
		System.out.println(res);
		
		
		
		
		

	}

}
