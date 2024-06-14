package com.OOP.Polymorphism;

public class MainFunctionOverloading {

	public static void main(int args)
	{
		System.out.println("Main with int args");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main with String[] args");
		main(100);
		main(89.88);
		
	}
	
	public static void main(double args)
	{

		System.out.println("Main with double args");
	}

}
