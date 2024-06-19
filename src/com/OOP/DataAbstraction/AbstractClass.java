package com.OOP.DataAbstraction;

public abstract class AbstractClass
{
/*
 * abstract class is a class declared with abstract keyword
 * Abstract class can have implemented method and non implemented method
 * Any method without body is called abstract method and declared with abstract keyword
 * 
 *  As Abstract class is not fully implemented so we can not create Object
 *  All abstract method has to be implemented by child class
 *  
 *  Partial abstraction is possible
 *  
 */
	
	public void accept()
	{
		System.out.println("Accept() is implemented method");
	}
	
	//abstract
	public abstract void show();
	
	public static void main(String args[]) 
	{
		//Cannot instantiate the type AbstractClass
		//AbstractClass a1=new AbstractClass();
		
	}
	
	
	
	
}
