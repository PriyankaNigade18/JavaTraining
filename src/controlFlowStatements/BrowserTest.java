package controlFlowStatements;

import java.util.Scanner;

public class BrowserTest {

	public static void main(String[] args)
	{

		/*
		 * String equality
		 * 1.equals():Exact match but it is case sensitive
		 * 2.equalsIgnoreCase():Exact match it is not case sensitive
		 
		String name1="Riya";
		String name2="riya";
		System.out.println(name1.equals(name2));//false
		System.out.println(name1.equalsIgnoreCase(name2));//true
		
		*/
		

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your browser name:");
		String bname=sc.nextLine();
		
		switch(bname.toLowerCase())
		{
		case "chrome": 
			System.out.println("Test is executing on chrome");
			break;
		case "edge": 
			System.out.println("Test is executing on edge");
			break;
		case "firefox": 
			System.out.println("Test is executing on firefox");
			break;
			default: 
				System.out.println("Invalid browser!");
		}
		
		
		
		
		
		
		/*
		if(bname.equalsIgnoreCase("chrome"))
		{
			System.out.println("Test is executing on Chrome!");
		}else if(bname.equalsIgnoreCase("edge"))
		{
			System.out.println("Test is executing on Edge!");
		}else if(bname.equalsIgnoreCase("firefox"))
		{
			System.out.println("Test is executing on Firefox!");
		}else
		{
			System.out.println("Invalid browser name!");
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
