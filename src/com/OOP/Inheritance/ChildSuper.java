package com.OOP.Inheritance;

public class ChildSuper extends ParentSuper 
{
	int cid=201;
	
	public void childIncome()
	{
		System.out.println("Parent id: "+super.pid);
		super.parentIncome();
		System.out.println("child id: "+cid);
		System.out.println("ChildIncome......$18000");
	}

	public ChildSuper ()
	{
		super();
		System.out.println("Child constructor is calling!.....");
	}
	
	public static void main(String[] args)
	{
		ChildSuper c1=new ChildSuper();
		c1.childIncome();

	}

}
