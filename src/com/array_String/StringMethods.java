package com.array_String;

public class StringMethods {

	public static void main(String[] args)
	{
		//length()
		String s1="Hello All";
		System.out.println("Length of String: "+s1.length());//9
		
		//toUpperCase() toLowerCase()
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		

		//concat() +
		
	String s2="Hello";
	String s3="Welcome";
	System.out.println(s2+" "+s3);
	System.out.println(s2.concat(" "+s3));
		
		/*
		 * equality 
		 * 1.equals()
		 * ---------------
		 * case sensitive
		 * 
		 * 2.equalsIgnoreCase()
		 * ---------------------
		 * not case sensitive
		 */
		
		String act="Welcome to OOP Principles Learning!";
		String exp="welcome to OOP principles learning!";
		
		System.out.println("Using equals():"+act.equals(exp));//false
		
		System.out.println("Using equalsIgnoreCase():"+act.equalsIgnoreCase(exp));//true

		//contains()- partail match
			
		System.out.println("Test for OOP?: "+act.contains("OOP"));//true
		
		System.out.println("Test for java?: "+act.contains("java"));//false
		
		System.out.println("Test for learning?: "+act.contains("Learning"));//true
		
		
		//startsWith(Prefix value)  

		
		System.out.println("Test string starts with Welcome?: "+act.startsWith("Welcome"));//true
		
		System.out.println("Test string starts with Wel?: "+act.startsWith("Wel"));//true

		System.out.println("Test string starts with W?: "+act.startsWith("W"));//true

		System.out.println("Test string starts with come?: "+act.startsWith("come"));//false

//endsWith(suffix value)
		System.out.println("string ends with  Learning!"+act.endsWith("Learning!"));//true
		System.out.println("string ends with  ing!"+act.endsWith("ing!"));//true

		System.out.println("string ends with  g!"+act.endsWith("g!"));//true

		System.out.println("string ends with  Learn: "+act.endsWith("Learn"));//false

		System.out.println("string ends with  earning!"+act.endsWith("earning!"));//true

		//trim- To ignore white space before and after string 
		
		String s4="     Welcome  All      ";
		System.out.println(s4);
		System.out.println(s4.trim());
		s4=s4.trim();
		
		//charAt()
		System.out.println(s4.charAt(0));//W
		
		//indexOf(char ch)
		System.out.println(s4.indexOf('W'));//0
		
		//substring()
		
		String msg="OOP contains four important principles";
		
		//substring(begin value)
		System.out.println(msg.substring(5));
		//substring(begin,end-1)
		System.out.println(msg.substring(0,5));
		
		//isEmpty()
		String ss="";
		System.out.println(ss.isEmpty());
		
		//replace
		
		String ss1="Welcome";
		System.out.println(ss1);
		System.out.println(ss1.replace('e','x'));
		
		//replace first character ton lowercase
		System.out.println(ss1.replace(ss1.charAt(0),ss1.toLowerCase().charAt(0)));
		
		//toCharArray()
		char ch[]=ss1.toCharArray();
		for(char i:ch)
		{
			System.out.println(i);
		}
		
		
		//split(regular expression)
		
		String pl="C,C++,Java,Python,C#";
		
		System.out.println(pl);
		
		//String arr[]=pl.split(",");
		String arr[]=pl.split(",", 4);
		for(String i:arr)
		{
			System.out.println(i);
		}
		
		//System.out.println(pl.split(",")[3]);
		
		
		//test amount is matching to 1870=int	
		
		String bill="Your total amount is 1870";
		
		
		String ss2="java Programming";
		String res="";
		System.out.println("Original: "+ss2);
		for(int i=0;i<ss2.length();i++)
		{
			if(i%2==0)
			{
			res=res+ss2.toUpperCase().charAt(i);	
			}else
			{
			res=res+ss2.toLowerCase().charAt(i);
			}
		}
			
		System.out.println("After Test:"+res);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
