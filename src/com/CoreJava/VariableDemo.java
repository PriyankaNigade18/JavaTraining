package com.CoreJava;

public class VariableDemo 
{
	int id=101;//instance variable
	static String clgname="AISSPMS";//static variable
	
	public void show()
	{
		int marks=90;//local variable
		System.out.println("College name is: "+clgname);
		System.out.println("Student id is: "+id);
		System.out.println("Marks from show() : "+marks);
	}
	
	
	
	public static void main(String[] args)
	{
		
		System.out.println("College name is: "+clgname);

		int marks=100;
		System.out.println("Marks from main(): "+marks);

		VariableDemo v1=new VariableDemo();
		v1.show();


	}

}
