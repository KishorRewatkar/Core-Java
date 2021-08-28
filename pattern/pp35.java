package pattern;

public class pp35 {

	public static void main(String[] args) {
		char ch='A';
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<9; j++)
			{
				if(j-i<=0)
				{
					System.out.print((char)(i+j+1+ch));
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
