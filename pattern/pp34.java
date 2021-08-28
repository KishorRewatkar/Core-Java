package pattern;

public class pp34 {

	public static void main(String[] args) {
		char ch='A';
		for(int i=0; i<=5; i++)
		{
			for(int j=0; j<=6; j++)
			{
				if(i+j<=5)
				{
					System.out.print((char)(j+ch));
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
