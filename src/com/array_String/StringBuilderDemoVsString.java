package com.array_String;

public class StringBuilderDemoVsString {

	/*
	 * String is class in java
	 * String is collection of characters
	 * String is immutable class in java
	 * 
	 * String constant pool which does not allwed duplication
	 * 
	 * Ways
	 * =======
	 * 1.using literal- create object in SCP area
	 * 2.Using new keyword- creates two objects one inside scp and one inside heap(1st)
	 * 
	 * StringBuilder(not thread safe) and StringBuffer(thread safe) both are mutable classes in Java
	 * 
	 */
	public static void main(String[] args) 
	{

		StringBuilder br=new StringBuilder("Hello");
		System.out.println(br);
		
		br.append(" All");
		
		System.out.println(br);
		
		//reverse string using function
		br.reverse();
		
		System.out.println(br);
		
		
		//Reverse a string without method
		String s1="Java Programming";
		String res="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			res=res+s1.charAt(i);
		}
		
		System.out.println(res);
		

	}

}
