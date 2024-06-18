package com.OOP.Inheritance;

public class AccessModifierTest {

	int id=101;//default
	public String name="Pratik";
	private long phno=998887776L;
	protected int acno=876688;
	
	
	public static void main(String[] args)
	{
		AccessModifierTest a1=new AccessModifierTest();
		
		// Same clas
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.phno);
		System.out.println(a1.acno);

	}

}
