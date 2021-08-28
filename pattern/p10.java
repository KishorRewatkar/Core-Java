package pattern;

public class p10 {

	public static void main(String[] args) {
		
		int numcount=1, charcount=0; 
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<10; j++)
			{
				if(i+j>=4 && j-i<=5)
				{
					if(j<=4)
						System.out.print(numcount);
					else
						System.out.print((char)(charcount+65));
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
			numcount++;
			charcount++;
		}
	}
}
