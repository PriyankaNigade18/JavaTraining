package com.OOP.Encapsulation;

class Employee
{
	//Encapsulation=Data+Functions
	
	//data hiding or data security is possible using private AM
	private int id=101;
	private String name="Poonam";
	
	//public methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//Business logic
	public void show()
	{
		System.out.println("Id is: "+id);
		System.out.println("Name is: "+name);
	}
}


public class EncapsulationDemo {

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.show();
		
//		e1.id=201;
//		e1.name="Riya";
		e1.setId(111);
		e1.setName("Jay");
		
//		
		e1.show();

	}

}
