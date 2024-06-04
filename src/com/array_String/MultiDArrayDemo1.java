package com.array_String;

public class MultiDArrayDemo1 {

	public static void main(String[] args)
	{
		//using new keyword
		int arr[][]=new int [3][2];
		arr[0][0]=10;
		arr[0][1]=20;
		
		arr[1][0]=30;
		arr[1][1]=40;
		
		arr[2][0]=50;
		arr[2][1]=60;
		
		System.out.println("Number of rows: "+arr.length);
		System.out.println("Number of columns: "+arr[0].length);
		
		//single data

		System.out.println(arr[1][1]);//40
		
		
		//System.out.println(arr[2][2]);//ArrayIndexOutOfBoundsException
		
		System.out.println("******Ietration using for loop***********");
		
		for(int r=0;r<arr.length;r++)
		{
			for(int c=0;c<arr[r].length;c++)
			{
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();//after one row
		}
		
		//using literal way
		int arr2[][]= {{10,20,30},{40,50,60},{70,80,90},{100,200,300}};
		System.out.println("Number of rows: "+arr2.length);
		System.out.println("Number of columns: "+arr2[0].length);
		
		for(int r=0;r<arr2.length;r++)
		{
			for(int c=0;c<arr2[r].length;c++)
			{
				System.out.print(arr2[r][c]+"  ");
			}
			System.out.println();//after one row
		}
		
		

	}

}
