package com.OOP.Polymorphism;

public class AmazonSearch
{
	public void search(String pname)
	{
		System.out.println("Product searched by its name: "+pname);
	}

	
	public void search(int price)
	{
		System.out.println("Product searched by its price: "+price);
	}
	
	public void search(String pname,int price)
	{
		System.out.println("Product searched by its name: "+pname+" and price: "+price);
	}
	
	public void search(String pname,String bname)
	{
		System.out.println("Product searched by its name: "+pname+" and brand name: "+bname);
	}
	
	public void search(String pname,String bname,int price)
	{
		System.out.println("Product searched by its name: "+pname+" and brand name: "+bname+" and price: "+price);
	}
	


}
