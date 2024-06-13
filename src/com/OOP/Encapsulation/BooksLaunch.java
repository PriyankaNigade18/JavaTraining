package com.OOP.Encapsulation;

class Books
{
	private int pageno;

	public int getPageno()
	{
		System.out.println("Provide access to Book");
		return pageno;
	}

	public void setPageno(int pageno)
	{
		if(pageno>0)
		{
		this.pageno = pageno;
		
		}else
		{
			System.out.println("Deny the access!");
		}
	}
	
}



public class BooksLaunch
{

	public static void main(String[] args)
	{

		Books b1=new Books();
		b1.setPageno(12);
		System.out.println(b1.getPageno());
		
		System.out.println("****************");
		
		Books b2=new Books();
		b2.setPageno(-9);
		System.out.println(b2.getPageno());
		

	}

}
