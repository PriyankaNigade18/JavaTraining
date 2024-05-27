package controlFlowStatements;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) 
	{
		/*
		 * accept marks 
		 * compare marks>=90 ......A
		 * compare Marks>=95........A++
		 * otherwise ---------B
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter marks");
		int marks=sc.nextInt();		
		
		if(marks>=90)
		{
			if(marks>=95)
			{
				System.out.println("A++");
			}else
			{
				System.out.println("A");
			}
		}else
		{
			System.out.println("B");
		}
		
		
		
		
		
		
	}

}
