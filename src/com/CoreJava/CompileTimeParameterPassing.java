package com.CoreJava;

public class CompileTimeParameterPassing 
{
	public void info(int id,String name)
	{
		System.out.println("Id is: "+id);
		System.out.println("Name is: "+name);
	}

	public static void main(String[] args) {


		CompileTimeParameterPassing  c1=new CompileTimeParameterPassing ();
		/*
		 * When we are passing data(argument) at the time of calling that methos is called
		 * Compile time parameter passing
		 */
		c1.info(101,"Amit");
		
	}

}
