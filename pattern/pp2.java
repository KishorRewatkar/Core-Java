package pattern;

public class pp2 {

	public static void main(String[] args) {
		
		for(int i=0; i<=5; i++)
		{
			for(int j=0; j<=5-i; j++)
			{
				System.out.print("*");
//				if(i-j>=0)
//				{
//					System.out.print("*");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
			}
			System.out.println(" ");
		}
	}
}
