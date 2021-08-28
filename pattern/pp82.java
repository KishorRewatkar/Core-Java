package pattern;

public class pp82 {

	public static void main(String[] args) {
		
		for(int i=1; i<6; i++)
		{
			for(int j=1; j<10; j++)
			{
				if(j-i<=0 || i+j>=10)
				{
					System.out.print(i);
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
