package pattern;

public class pp26 {
	public static void main(String[] args) {
		
		char ch='A';
		for(int i=0; i<=4; i++)
		{
			for(int j=0; j<=4; j++)
			{
				if(j-i<=0)
				{
					System.out.print((char)(ch+i));
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
