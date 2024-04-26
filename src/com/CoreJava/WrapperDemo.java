package com.CoreJava;

public class WrapperDemo {

	public static void main(String[] args)
	{

		//Object to primitive
		Integer i1=67;
		int x=i1.intValue();
		System.out.println(x);
		
		Long l1=7678888766L;
		long y=l1.longValue();
		System.out.println(y);
		
		
		
		//String s1="100ABC";
		String s1="100";
		System.out.println(s1+100);//100100
		//string to int
		int num=Integer.parseInt(s1);//NumberFormatException
		System.out.println(num+100);//200
		
		
		String s2="56.77";
		System.out.println(s2+11.11);//56.7711.11
//	String to double
		double d1=Double.parseDouble(s2);
		
		System.out.println(d1+11.11);//67.88
		
		String s3="P";
		System.out.println("String data: "+s3);
		/*
		 * string to char
		 * 
		 * String is collection of characters only
		 * String is class in java
		 * Multiple method support
		 * charAt(index):char
		 * 
		 */
		char ch=s3.charAt(0);
		System.out.println("character data is: "+ch);
		
		
		String s4="TRUE";
		System.out.println(s4);
		//string to boolean
		boolean status=Boolean.parseBoolean(s4);
		System.out.println(status);//true
		
		
		//primitive to Object(String class)
		
		int u=90;
		System.out.println(u+100);//190
		String ss1=String.valueOf(u);
		System.out.println("int to string: "+ss1+100);
		
		
		String s6="Riya";
		boolean st=Boolean.parseBoolean(s6);		
		System.out.println(st);//false
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
