package pattern;

public class pp30 {

	public static void main(String[] args) {
		char ch='A';
		for(int i=0; i<=11; i++)
		{
			for(int j=0; j<=6; j++)
			{
				if(i+j<=5)
				{
					System.out.print((char)(5-j-i+ch));
				}
				else if(j-i<=-6)
				{
					System.out.print((char)(ch+i-j-6));
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		char ch='A';
//		for(int i=0; i<12; i++)
//		{
//			for (int j = 0; j <6; j++) 
//			{
//				if(j+i<=5)
//				{
//					System.out.print((char)(5-j-i+ch));
//				}
//				else if(j-i<=-6)
//				{
//					System.out.print((char)(i-j-6+ch));
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//					
//			}
//			System.out.println();
//		}
	}
}
