package pattern;

public class p8 {

	public static void main(String[] args) {
		
			//      1
			//    A B C
			//   2 3 4 5 6
			//  D E F G H I J
			//7 8 9 10 11 12 13 14 15
		int nocount = 1;
		int charcount=0;
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<9; j++)
			{
				if(i+j<=2 || j-i>=4)				
					System.out.print(" ");				
				else
				{
					if(i%2==0)
					System.out.print(nocount+++" ");
					else
				     System.out.print((char)(charcount+++65)+" ");
				}
			}
			System.out.println();
		}
		
		
		
	}
}
