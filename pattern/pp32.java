package pattern;

public class pp32 {

	public static void main(String[] args) {
		char ch='A';
		for(int i=0; i<6; i++)
		{
			for(int j=0; j<6; j++)
			{
				if(j-i<=0)
				{
					System.out.print((char)(5-j+ch));
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
