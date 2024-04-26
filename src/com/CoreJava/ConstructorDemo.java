package com.CoreJava;

public class ConstructorDemo 
{
	/*
	 * Constructor used to Initialize Object
	 * When we create Object we call one constructor
	 * 
	 * Constructor name its similar to className
	 * 
	 * TypeS:
	 * =========
	 * 1.default- jvm calls 
	 * 2.parameterized (some data /argument you pass to variable)
	 * 
	 */
	
	int id;
	
	//declaration of cons-default constructor
	public ConstructorDemo()//0 parameter
	{
		System.out.println("This is default constructor is calling!");
		id=100;
		System.out.println("id is: "+id);
	}
	
	//parameterized constructor
	public ConstructorDemo(int i)//one parameter i=101
	{
		System.out.println("Parameterized constructor is calling!");
		id=i;
		System.out.println("Id is: "+id);
		
	}
	
	

	public static void main(String[] args)
	{

		ConstructorDemo  c1=new ConstructorDemo();
		ConstructorDemo  c2=new ConstructorDemo();
		ConstructorDemo  c3=new ConstructorDemo();
		
		ConstructorDemo  c4=new ConstructorDemo(101);
		ConstructorDemo  c5=new ConstructorDemo(102);
		ConstructorDemo  c6=new ConstructorDemo(103);
	}

}
