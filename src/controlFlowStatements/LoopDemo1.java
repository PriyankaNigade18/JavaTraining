package controlFlowStatements;

public class LoopDemo1 {

	public static void main(String[] args) 
	
	{
		//Print hello statement 10 time
		for(int i=1;i<=10;i++)
		{
			System.out.println("Hello");
		}

		
		System.out.println("************************");
		//Print 1 to 10 numbers
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
		
		System.out.println("************************");

//		for(;;)//true
//		{
//			System.out.println("Hi");//infinite time
//		}
		
		int i=1;
		while(i<=5)
		{
			System.out.println("Hello");
			i++;
		}
		
		
		
		
		
		System.out.println("************************");
		
		//Sum of digits
		
		int num=103,rem,sum=0;
		int temp=num;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			sum=sum+rem;
		
		}
		
		System.out.println("Sum of digits for number  :"+temp+" is :"+sum);
		
		System.out.println("***************************************");
		
		int no=123,r,s=0;
		while(no>0)
		{
			r=no%10;
			no=no/10;
			s=s*10+r;
			
		}
		
		
		System.out.println("Reverse of a number 123 is:  "+s);
		
		
		System.out.println("*******************************");
		

		int x=1;
		while(x<=5)
		{
			System.out.println("Welcome!");
			x++;
		}
		
		System.out.println("*******************************");

		//do while- Exit control loop
		
		int k=1;
		do {
			System.out.println("Hello");
			k++;
		}while(k==5);
		
		
		
	}

}
