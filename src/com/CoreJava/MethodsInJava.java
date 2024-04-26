package com.CoreJava;

public class MethodsInJava
{
	public void accept()
	{
		System.out.println("It is instance method !");
	}
	
	public static void show()
	{
		System.out.println("Static method is calling!");
	}

	public static void main(String[] args) 
	{

		show();
		MethodsInJava.show();
		
		
		MethodsInJava m1=new MethodsInJava();
		m1.accept();
		
		//The static method show() from the type MethodsInJava should be accessed in a static way
		//m1.show();
		
		
		
		

	}

}
