package com.OOP.Polymorphism;

public class AmazonSerachTest {

	public static void main(String[] args) 
	{
		AmazonSearch a1=new AmazonSearch();
		a1.search("Bag");
		a1.search(10000);
		a1.search("Iphone15", 90000);
		a1.search("laptop","Apple");
		a1.search("watch","Titen",20000);
		

	}

}
