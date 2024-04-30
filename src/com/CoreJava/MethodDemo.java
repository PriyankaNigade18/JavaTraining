package com.CoreJava;

public class MethodDemo 
{
	/*
	 * 1.Instance method
	 * ------------------
	 * Method can called by Object
	 * Method memory inside object
	 * 
	 * 2.Static method
	 * -------------------
	 * 1.WIthin same class without class name we can call
	 * 2.Within different class with class name we can call
	 * Static will get the memory inside class under meta space
	 */
	public void test1()
	{
		System.out.println("This is instance method");
	}
	
	public static void test2()
	{
		System.out.println("This is static method");
	}

	public static void main(String[] args)
	{

		test2();
		MethodDemo.test2();
		
		MethodDemo m1=new MethodDemo();
		m1.test1();
		//The static method test2() from the type MethodDemo should be accessed in a static way
		//m1.test2();
		
		
		
		

	}

}
