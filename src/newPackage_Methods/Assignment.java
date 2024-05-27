package newPackage_Methods;

import java.util.Scanner;

public class Assignment 
{
	public void details(String fname,String lname,char gen,long phno)
	{
		System.out.println("Your first name is: "+fname);
		System.out.println("Your last name is: "+lname);
		System.out.println("Your Gender is: "+gen);
		System.out.println("Your phone number is: "+phno);
	}

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first name");
		String fname=sc.nextLine();
		

		System.out.println("Enter your last name");
		String lname=sc.nextLine();
		
		System.out.println("Enter your gender name");
		char ch=sc.nextLine().charAt(0);
		
		System.out.println("Enter your phone number");
			long phno=sc.nextLong();

			
			Assignment a1=new Assignment();
			a1.details(fname,lname,ch,phno);
			
			sc.close();
			
	}

}
