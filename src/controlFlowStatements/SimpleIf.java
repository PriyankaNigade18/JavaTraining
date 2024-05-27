package controlFlowStatements;

import java.util.Scanner;

public class SimpleIf {

	public static void main(String[] args)
	{
		// Simple if help to validate one true condition
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age!");
		int age=sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("Valid age!");
		}
		
		System.out.println("Done!");
		
		sc.close();

	}

}
