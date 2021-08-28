package pattern;

public class p4 {

	public static void main(String[] args) {
		//1 1 1 1 1
		//1 2 2 2 2
		//1 2 3 3 3
		//1 2 3 4 4
		//1 2 3 4 5
		
		
		for (int i = 0; i <=4; i++)
		{
			for (int j = 0; j <=4; j++) 
			{
				if(j-i<=0)
				{
					System.out.print(j+1);
				}
				else
				{
					System.out.print(i+1);
				}
			}
			System.out.println(" ");
		}
		
		
		
		
		
		
		
		
		
//		int count=1;
//		for(int i=0; i<=4; i++)
//		{
//			for(int j=0; j<=5; j++)
//			{	
//	     		if(i==0 || j==0)
//	     		{
//	     			System.out.print(count);
//	     		}
//	     		else
//	     		{
//	     			if(i==1 || j==2)
//	     			{
//	     				System.out.print(count+1);
//	     			}
//	     			else
//	     			{
//	     				if(i==2 || j==3)
//	     				{
//	     					System.out.print(count+2);
//	     				}
//	     				else
//	     				{
//	     					if(i==3 || j==4)
//	     					{
//	     						System.out.print(count+3);
//	     					}
//	     					else
//	     					{
//	     						if(i==4 || j==5)
//	     						{
//	     							System.out.print(count+4);
//	     						}
//	     						else
//	     						{
//	     							System.out.print("");
//	     						}
//	     						
//	     						System.out.print("");
//	     					}
//	     					System.out.print("");
//	     				}
//	     				System.out.print("");
//	     			}
//	     				
//	     			System.out.print("");
//	     		}
//				
//			}
//			System.out.println(" ");
//		}
	}
}
