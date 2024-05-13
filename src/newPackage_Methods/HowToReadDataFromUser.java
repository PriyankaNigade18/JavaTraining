package newPackage_Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HowToReadDataFromUser {

	public static void main(String[] args) throws IOException
	{

		//scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		System.out.println("Your name is: "+name);
		System.out.println("Your age is: "+age);
		
		sc.close();
		
		
		
		
		
		//technique 1: read(): reads single character and return int type
//		System.out.println("Enter your age!");
//		int age=System.in.read();
//		System.out.println((char)age);
		
		//technique 2:BufferedReader class
		
//		System.out.println("Enter your age");
//		InputStreamReader ir=new InputStreamReader(System.in);
//		BufferedReader br=new BufferedReader(ir);
//		
//		String data=br.readLine();
//		int age=Integer.parseInt(data);
//		
//		System.out.println(age);
		
		
		
		
		

	}

}
