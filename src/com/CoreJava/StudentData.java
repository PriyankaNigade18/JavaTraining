package com.CoreJava;

public class StudentData 
{
	//data declaring
	int id;
	String name;
	
	//function
	public void show()
	{
		System.out.println("Id is: "+id);
		System.out.println("Name is: "+name);
	}
	
	StudentData(int i,String n)//local variable
	{
		id=i;//instance=local
		name=n;
		
	}

	public static void main(String[] args)
	{
		/*
		 * To access member of a class we need object to be create
		 * Syntax:
		 * class_name ref_variablename=new class_name();
		 * A a1=new A();
		 * new keyword is used to create an Object in java
		 * Class_name() this is constructor which is used to initialized object
		 */
		StudentData s1=new StudentData(101,"Riya");
		//s1.show();//default value
//		s1.id=101;
//		s1.name="Riya";
		s1.show();//original data
		
		
		System.out.println("******************");
		StudentData s2=new StudentData(102,"Ritika");
//		s2.id=102;
//		s2.name="Ritika";
		s2.show();
		
		System.out.println("******************");
		StudentData s3=new StudentData(103,"Amit");
//		s3.id=103;
//		s3.name="Amit";
		s3.show();
		
		
		
		
		
		

	}

}
