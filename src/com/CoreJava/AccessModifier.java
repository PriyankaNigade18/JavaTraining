package com.CoreJava;

public class AccessModifier 
{

	int id=101;//default
	public String name="Jay";
	private long phno=9876546788L;
	
	
	public static void main(String[] args)
	{
		//Same class
		
		AccessModifier a1=new AccessModifier();
	System.out.println(a1.id);
	System.out.println(a1.name);
	System.out.println(a1.phno);

	}

}
