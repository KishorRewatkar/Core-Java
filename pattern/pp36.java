package pattern;

public class pp36 {

	public static void main(String[] args) {
		char ch='A';
		for(int i=0; i<=5; i++)
		{
			for(int j=0; j<=5; j++)
			{
				if(j-i<=0)
				{
					System.out.print((char)(i-j+ch));
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
