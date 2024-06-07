package com.array_String;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String data=sc.nextLine();
		String res="";
		System.out.println(data);
		
		//index
		for(int i=0;i<data.length();i++)
		{
			if(i==0)
			{
				
				char ch=data.toUpperCase().charAt(0);
				res=res+ch;
			}else
			{
				res=res+data.charAt(i);
			}
		}
		System.out.println(res);
		

	}

}
