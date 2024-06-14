package com.OOP.Polymorphism;

public class CompileTimePoly {

	/*
	 * One thing in many form is polymorphism
	 * Two types
	 * ==============
	 * 1.Compile time (Method overloading)
	 * 2.Run time (Method Overriding)
	 * 
	 * Method can be overloaded only when method has same name
	 * declare in same class with different signatures
	 * 
	 * 1.Number of parameters
	 * 2.Type of parameters
	 * 3.Change the order
	 *  
	 *  purpose to Reusability
	 *  1.Method Overloading
	 *  2.Constructor Overloading
	 *  
	 *  In java Constructor overloading is possible but overriding is not possible
	 *  Main() overloading possible but technically it is not required to do the same
	 *  
	 *  
	 *  
	 */
	
	public void add()//0 parameters
	{
		int a=10,b=20;
		System.out.println("Addition is: "+(a+b));
	}
	
	//number of parameters
	public void add(int a,int b)//2 parameter
	{
		System.out.println("Addition is: "+(a+b));

	}
	public void add(int a,int b,int c)//3 parameter
	{
		System.out.println("Addition is: "+(a+b+c));

		
	}
	//type of parameter
	public void add(double a,int b)//2 parameter
	{
		System.out.println("Addition is: "+(a+b));

	}
	//change the order
	public void add(int a,double b)//2 parameter
	{
		System.out.println("Addition is: "+(a+b));

	}
	
	//constructor
	public CompileTimePoly()
	{
		System.out.println("This is default constructor");
	}
	
	
	public CompileTimePoly(String msg)
	{
		System.out.println("This is parameterized constructor: message is: "+msg);
	}
	
	public CompileTimePoly(String name ,int id)
	{
		System.out.println("This is parameterized constructor:name is "+name +" id is: "+id);
	}
	
	
	public static void main(String[] args)
	{
		CompileTimePoly c1=new CompileTimePoly ();
		c1.add();
		c1.add(100.11, 20);
		c1.add(200,11.220);
		c1.add(10,100);
		c1.add(100,1000,1000);
		
		
		CompileTimePoly c2=new CompileTimePoly ("Swara",1010);
	}

}
