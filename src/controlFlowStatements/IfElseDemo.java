package controlFlowStatements;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		// true and false conditions
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=sc.nextInt();	
		int num2=sc.nextInt();
		
		if(num1>num2)
		{
			System.out.println(num1+" is greater than "+num2);
		}else
		{
			System.out.println(num2+" is greater than "+num1);

		}
		
		
		
		//Test number is even odd
		//Test number is positive and negative
		//Test number is greater than other number
		
		
		
		
	}

}
