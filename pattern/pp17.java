package pattern;

public class pp17 {

	public static void main(String[] args) {
		
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j-i>=0 || j+i>=8)
				System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
		
		
		
		
		
		
		
		
//		for(int i=0; i<9; i++)
//		{
//			for(int j=0; j<6; j++)
//			{
//				if(j-i>0 && i+j>4)
//				System.out.print("*");
//				else
//				System.out.print(" ");
//			}
//			System.out.println(" ");
//		}
		
		
		
//		for(int i=2; i<6; i++)
//		{
//			for(int j=2; j<=6; j++)
//			{
//				if(j+i>6)
//				System.out.print("* ");
//				else
//			   System.out.print(" ");
//			}
//			System.out.println(" ");
//		}
	}
}
