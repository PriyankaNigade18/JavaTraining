package com.CoreJava;

public class StaticVsInstance 
{	/*
	 * Instance variable get the new memory when every time you create object
	 * Static variable get memory only one time and it share same memory with every new object 
	 */
	//int count=1;//instance variable
	static int count=1;//static
	
	StaticVsInstance()
	{
		
		System.out.println(count);
		count++;
	}
	
	public static void main(String[] args)
	{
		StaticVsInstance s1=new StaticVsInstance();
		StaticVsInstance s2=new StaticVsInstance();
		StaticVsInstance s3=new StaticVsInstance();
		StaticVsInstance s4=new StaticVsInstance();
		StaticVsInstance s5=new StaticVsInstance();

	}

}
