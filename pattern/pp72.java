package pattern;

public class pp72 {

	public static void main(String[] args) {
		char ch='A';
		for(int i=0; i<5; i++)
		{
			int count=1 ;
			for(int j=0;  j<9; j++)
			{
				if(i+j>=4 && j-i<=4)
				{
					System.out.print(count);
					if(j<4)
					{
						count++;		
					}
					else
					{
						count--;
					}
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
