package com.CoreJava;

public class Calculator 
{
	//data
	int a=10,b=5;
	
	//function
	public void add()
	{
		System.out.println("Addition is:"+(a+b));
	}
	
	
	public void sub()
	{
		System.out.println("Subtraction is:"+(a-b));

	}
	
	public void mul()
	{
		System.out.println("Multiplication is:"+(a*b));

	}
	
	public void div()
	{
		System.out.println("Division is:"+(a/b));
	
	}
	public static void main(String[] args) 
	{
		//for execution

		Calculator c1=new Calculator();
		c1.add();
		c1.sub();
		c1.mul();
		c1.div();
		
		
		
		

	}

}
