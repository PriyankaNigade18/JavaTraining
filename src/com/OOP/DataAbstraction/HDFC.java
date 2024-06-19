package com.OOP.DataAbstraction;

public class HDFC implements RBI
{
	
	public void custDetails()
	{
		System.out.println("HDFC......Customers details()");
	}

	@Override
	public void withdraw() {
		System.out.println("HDFC...withdraw()");
		
	}

	@Override
	public void deposite() {
		System.out.println("HDFC..deposite()");		
	}

	@Override
	public void rateofinterest() {
		System.out.println("HDFC..rateOfInterest(): 11%");
		
	}

}
