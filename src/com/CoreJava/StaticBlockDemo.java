package com.CoreJava;

public class StaticBlockDemo
{
	static int zcode;//static variable
	
	
	//static block
	static 
	{
		System.out.println("USed to initialized static variable");
		zcode=411047;
		System.out.println("Static value is: "+zcode);
		
	}
	

	//method
	public static void main(String[] args)
	{
		System.out.println("This is main() calling!");
		System.out.println(zcode);

	}

}
