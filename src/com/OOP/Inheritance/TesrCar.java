package com.OOP.Inheritance;

public class TesrCar {

	public static void main(String[] args)
	{
		System.out.println("Scenario1: Childc lass ref and child class object");
		BMW b1=new BMW();
		b1.autoEngine();//individual
		b1.start();//inherited
		b1.refule();//inherited
		b1.stop();//inherited
		b1.addBreak();
		System.out.println("Scenario2: Parent lass ref and Parent class object");

		Car c1=new Car();
		c1.start();
		c1.refule();
		c1.stop();
		c1.addBreak();
		
		System.out.println("Scenario3: Parent lass ref and child class object");

		Car c2=new BMW();
		c2.start();
		c2.refule();
		c2.stop();
		c2.addBreak();
		System.out.println("***********************");
		
		Audi a1=new Audi();
		a1.autoGear();
		a1.start();
		a1.refule();
		a1.stop();
		a1.addBreak();

	}

}
