package thisKeyword;

public class ReturnStatement 
{
	
	public void add()//0 parameter
	{
		int a=10,b=20;
		System.out.println("Addition is: "+(a+b));
		
	}
	
	public void sub(int a,int b)//2 parameter
	{
		System.out.println("Subtraction is:"+(a-b));
	}
	/*
	 * return keyword is used to return anything from method
	 * It returns output to calling function.
	 */
	
	public int mul(int a,int b)
	{
		return a*b;
	}
	
	public String info(String msg)
	{
		return msg;
	}

	public static void main(String[] args) {

		ReturnStatement r1=new ReturnStatement();
		r1.add();
		r1.sub(100,50);
		int res=r1.mul(10,10);//calling function
		System.out.println("Multiplication is: "+res);
		String data=r1.info("Hello All!");
		System.out.println(data);
		
	}

}
