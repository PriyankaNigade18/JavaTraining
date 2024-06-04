package com.array_String;

import java.util.Arrays;

public class ArraySortDemo {

	public static void main(String[] args)
	{

		/*
		 * Arrays class 
		 * sort()
		 */
		System.out.println("Sorting with Method sort()");
		int arr[]= {100,20,70,30,10};
		Arrays.sort(arr);
		for(int i:arr)
		{
			System.out.println(i);
		}

		
		System.out.println("Sorting without method");
		
		int a[]= {100,20,70,30,10};
		
		int temp=0;
		System.out.println("Array Elements before sort!");
		
		for(int i:a)
		{
			System.out.println(i);
		}
		System.out.println("Array Elements after sort!");

		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				
				}
			
			}
			System.out.println(a[i]);
		}
	
		
		


		
		
		
		
		
		
		
		
		
		
		
		
	}

}
