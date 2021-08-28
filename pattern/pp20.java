package pattern;

public class pp20 {

	public static void main(String[] args) {
		
		for(int i=0; i<=9; i++)
		{
			for(int j=0; j<=12; j++)
			{
				if(true)
				{
					if(i+j<=5)
					{
				    	System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
}
