package pattern;

public class Cw5 {

	public static void main(String[] args) {
		
		char ch='A';
		for(int i=0; i<=6; i++)
		{
			for(int j=0; j<=12; j++)
			{
			  if(i+j<=6)
				  System.out.print((char)(j+ch));
			  else if(j-i>=6)
		
					  System.out.print((char)(Math.abs(12-j)+ch));
			  else
				  System.out.print(" ");
			}
			System.out.println();
		}
//		(char)(j+ch)
//		(char)(Math.abs(14-j)+ch)
	}
}
