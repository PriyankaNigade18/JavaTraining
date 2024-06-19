package com.OOP.DataAbstraction;

public class ChildAbstract extends AbstractClass
{

	public void childDetails()
	{
		System.out.println("Child.....Abstractclassmethod");
	}
	
	@Override
	public void show() {

		System.out.println("child.....implemented abstarct method");
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Scenario1: Child class ref and child class object");
		ChildAbstract c1=new ChildAbstract();
		c1.accept();//inherited method
		c1.childDetails();//individual
		c1.show();//inherited abstract method
		System.out.println("Invalid-Scenario2: Parent class ref and Parent class object");
		//Cannot instantiate the type AbstractClass
		//AbstractClass a1=new AbstractClass();
		System.out.println("Scenario2: Parent class ref and child class object");

		AbstractClass a1=new ChildAbstract();
		a1.accept();
		a1.show();
		
		
		
		
	}



	

}
