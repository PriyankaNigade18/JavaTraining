package com.array_String;

public class SingleDimentionalarray {

	public static void main(String[] args) 
	{

		//declare
		int sid[]=new int[5];
		
		//initialization
		sid[0]=101;
		sid[1]=102;
		sid[2]=103;
		sid[3]=104;
		sid[4]=105;
		
		System.out.println("Length of the array: "+sid.length);
		
		//to get the single data
		System.out.println(sid[2]);//0
		
		System.out.println(sid[4]);//105
		
		//System.out.println(sid[-1]);//ArrayIndexOutOfBoundsException

		System.out.println("***********Iteration using for loop***********");
		
		for(int i=0;i<sid.length;i++)
		{
			System.out.println(sid[i]);
		}
		
		System.out.println("*****************************");
		
		String name[]=new String[3];
		name[0]="Swara";
		name[1]="Riya";
		name[2]="Reva";
		
		System.out.println("Total names are: "+name.length);
		
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		
		System.out.println("*****************************");

		double marks[]=new double[3];
		marks[0]=77.78;
		marks[1]=78.66;
		marks[2]=67.88;
		
		System.out.println("Total Marks are : "+(marks[0]+marks[1]+marks[2]));
		
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
