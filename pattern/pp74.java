package pattern;

public class pp74 {

	public static void main(String[] args) {

		char ch='A';
		for(int i=0; i<5; i++)
		{
			int count=0;
			for(int j=0;  j<9; j++)
			{
				if(i+j>=4 && j-i<=4)
				{
					System.out.print((char)(count+ch));
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
