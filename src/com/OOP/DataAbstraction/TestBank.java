package com.OOP.DataAbstraction;

public class TestBank {

	public static void main(String[] args)
	{
		// child class and child class object
		HDFC h1=new HDFC();
		h1.custDetails();
		h1.withdraw();
		h1.deposite();
		h1.rateofinterest();
		System.out.println(h1.x);
		//h1.x=90900;
		
		System.out.println("********************");
		
		
		RBI r1=new HDFC();
		r1.withdraw();
		r1.deposite();
		r1.rateofinterest();
		

	}

}
