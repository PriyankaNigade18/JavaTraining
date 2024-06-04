package com.array_String;

public class AdditionOfArray {

	public static void main(String[] args) 
	{

		int a[]= {10,20,30};
		int b[]= {10,20,30};

	
		System.out.println("First array data");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}
		
		System.out.println("second array data");
		
		for(int j=0;j<b.length;j++)
		{
			System.out.println(b[j]);
		}
		
		System.out.println("Addition is:");
		int result[]=new int[3];
		
		for(int i=0;i<3;i++)
		{
			result[i]=a[i]+b[i];
			System.out.println(result[i]);
		}
		
		
	}

	
}
