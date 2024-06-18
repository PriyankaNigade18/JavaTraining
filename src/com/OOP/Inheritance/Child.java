package com.OOP.Inheritance;

public class Child extends Parent
{
	//child will override parent class method
	@Override
	public void color()
	{
		System.out.println("Blue");
	}
	

	public static void main(String[] args)
	{
		System.out.println("Scenario1: child class ref and child class object");
		Child c1=new Child();
		c1.color();//blue
		
		System.out.println("Scenario2: Parent class ref and Parent class object");

		Parent p1=new Parent();
		p1.color();//red
		
		System.out.println("Scenario3: Parent class ref and child class object");
		Parent p2=new Child();
		p2.color();//blue
				
		
		
		
		


	}

}
