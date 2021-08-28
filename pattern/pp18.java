package pattern;

public class pp18 {

	public static void main(String[] args) {
		
		for(int i=0; i<=10; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(j+i>=5 && i-j<=3)
				{
					System.out.print("* ");
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
