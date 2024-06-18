package com.OOP.Inheritance;


//final class Demo
class Demo
{
	final int x=100;
	
	public final void color()
	{
		System.out.println("Red");
	}
}
//The type FinalKeyword cannot subclass the final class Demo

public class FinalKeyword extends Demo
{
	//Cannot override the final method from Demo
//	@Override
//	public void color()
//	{
//		System.out.println("Yellow");
//	}
	public static void main(String[] args) 
	{
	 FinalKeyword f1=new FinalKeyword();
	 System.out.println(f1.x);
	 //f1.x=500;//The final field Demo.x cannot be assigned
	 System.out.println(f1.x);
	 
	 f1.color();


	}

}
