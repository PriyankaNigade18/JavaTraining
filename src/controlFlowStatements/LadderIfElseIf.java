package controlFlowStatements;

import java.util.Scanner;

public class LadderIfElseIf {

	public static void main(String[] args) 
	{

		//test character is vowel
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a charcater!");
		char ch=sc.nextLine().charAt(0);
		
		if(ch=='a')
		{
			System.out.println(ch+" is a vowel");
		}else if(ch=='i')
		{
			System.out.println(ch+" is a vowel");

	}else if(ch=='e')
	{
		System.out.println(ch+" is a vowel");

	}else if(ch=='o')
	{
		System.out.println(ch+" is a vowel");

	}else if(ch=='u')
	{
		System.out.println(ch+" is a vowel");

	}else
	{
		System.out.println(ch+" is not a vowel");

	}
			
		
		
		
		//operators
		/*
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println(ch+" is a vowel");
		}
		else
		{
			System.out.println(ch+" is not a vowel");
		}
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
