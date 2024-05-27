package controlFlowStatements;

public class BranchingStatements {

	public static void main(String[] args)
	{
//break cannot be used outside of a loop or a switch
//		if(true)
//		{
//			break;
//		}
		
		for(int i=1;i<=10;i++)
		{
			if(i>5)
			{
				break;//exit from loop
			}else
			{
				System.out.println(i);
			}
		}
		
		System.out.println("**********************");
		
		
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;//skip certain part of the code
			}else
			{
				System.out.println(i);
			}
		}
		
		
		
		
		

	}

}
