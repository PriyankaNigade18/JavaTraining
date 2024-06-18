package com.OOP.Encapsulation;

import com.OOP.Inheritance.AccessModifierTest;

public class ModifierTest extends  AccessModifierTest
{

	public static void main(String[] args)
	{
		// Different package and different clas
		
		AccessModifierTest  a1=new AccessModifierTest ();
		System.out.println(a1.name);
		
		//protected class must be subclass
		ModifierTest  m1=new ModifierTest ();
		System.out.println(m1.acno);
	}

}
