package thisKeyword;

public class ThisKeywordDemo2
{
	//this can be used to invoke current class method (implicitly)

	public void m1()
	{
		System.out.println("This is method 1");
		this.m3();//calling method using this
	}
	
	public void m2()
	{
		System.out.println("This is method 2");
		m3();//calling m3 without keyword
	}
	public void m3()
	{
		System.out.println("This is method 3");
	}
	
	
	
	public static void main(String[] args)
	{
		ThisKeywordDemo2 t1=new ThisKeywordDemo2();
		t1.m1();
		t1.m2();

	}

}
