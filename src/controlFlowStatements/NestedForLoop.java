package controlFlowStatements;

public class NestedForLoop {

	public static void main(String[] args)
	{

//		int num=2;
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println(num*i);
//		}
//
//		System.out.println("********************");
		
		
		for(int num=1;num<=10;num++)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.print(num*i+"\t");
			}
			System.out.println();
			
		}
		
	System.out.println("********************");
	
	
	
	for(int r=1;r<=4;r++)
	{
		
		for(int c=1;c<=4;c++)
		{
			System.out.print("*"+" ");
		}
		
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	

		
		
	}

}
