package com.array_String;

public class StringDemo1 {
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
 */
	public static void main(String[] args)
	{
		String s1="Hello";
		
		
		String s2=new String("Hello");
		/*
		 * String is class so we compare it using methods
		 * if you compare with Operator then it match ids created by jvm
		 */
		
		System.out.println(s1==s2);//false
		
		String s3="Hello";
		
		System.out.println(s1==s3);//true
		

	}

}
