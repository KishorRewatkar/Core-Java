package pattern;

public class pp25 {

	public static void main(String[] args) {
		
		char ch='A';
		for(int i=0; i<=4; i++)
		{
			for(int j=0; j<=4; j++)
			{
				if(j-i<=0)
				{
					System.out.print((char) (ch+j));
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
//		   char ch='A';
//			for (int i = 1; i <6; i++)
//			{
//				for (int j = 0; j <i; j++) 
//				{
//			       System.out.print((char) (ch+j));
//				}
//				System.out.println(" ");
//			}
//			for (int i = 0; i <4; i++)
//			{
//				for (int j = 0; j <4-i; j++) 
//				{
//			       System.out.print((char)(ch+j));
//				}
//				System.out.println(" ");
//			}
	}
}
