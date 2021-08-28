package pattern;

public class p4Char {

	public static void main(String[] args) {
		char ch='A';
		for (int i = 0; i <=5; i++)
		{
			for (int j = 0; j <=5; j++) 
			{
				if(j-i<=0)
				{
					System.out.print((char)(ch+j));
				}
				else
				{
					System.out.print((char)(ch+i));
				}
			}
			System.out.println(" ");
		}
		
	}
}
