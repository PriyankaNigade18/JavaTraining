package com.array_String;

public class MultiDArrayDemo2 {

	public static void main(String[] args)
	{

		Object data[][]= {{"UserName","Password"},{"Admin","admin123"},{"Riya","Test123"},{"Soumya","test123"}};
		
		System.out.println("Number of rows: "+data.length);//3
		System.out.println("Number of columns: "+data[0].length);//2
		
		System.out.println("**********Iteration*************");
		for(int i=1;i<data.length;i++)
		{
			for(int j=0;j<data[i].length;j++)
			{
				System.out.print(data[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println("**********for each Iteration*************");

		for(Object i[]:data)
		{
			for(Object j:i)
			{
				System.out.print(j+"  ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
