package com.array_String;

public class ArrayAssignment1 {

	public static void main(String[] args) 
	{

		int num[]={1,2,3,4,5};
		
		int result[]=new int[5];
		int data;
		
		System.out.println("Original array is:");
		for(int i:num)
		{
			System.out.println(i);
		}
		//logic
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0)
			{
			data=num[i];
			result[i]=data;
			
			}else
			{
				continue;
			}
			
		}
		
	System.out.println("Array with even numbers only");
	
	for(int i:result)
	{
		System.out.println(i);
	}
		
		

	}

}
