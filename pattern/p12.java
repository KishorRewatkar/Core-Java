package pattern;

public class p12 {

	public static void main(String[] args) {
//		54321
//		6543
//		765
//		87
//		9
		
		for(int i=0; i<5; i++)
		{ 
			for(int j=0; j<5; j++)
			{
				if(i+j<=4)
				{
					System.out.print(5-j+i );
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
	}
}
