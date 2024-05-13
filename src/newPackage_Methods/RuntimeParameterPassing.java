package newPackage_Methods;

import java.util.Scanner;

public class RuntimeParameterPassing 
{
	public void add(int a,int b)
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	public void sub(int a,int b)
	{
		System.out.println("Subtraction is: "+(a-b));
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		RuntimeParameterPassing r1=new RuntimeParameterPassing();
		r1.add(num1, num2);
		r1.sub(num1, num2);
		
		sc.close();
		
		
		
		


	}

}
