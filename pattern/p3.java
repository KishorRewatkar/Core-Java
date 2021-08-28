package pattern;

public class p3 {
	public static void main(String[] args) {
		
		//1 2 3 4 5
		//4 3 2 1
		//1 2 3
		//2 1
		//1
		
		int count1=1; int count2=4;
		for(int i=1; i<6; i++)
		{
			for(int j=1; j<6; j++)
			{
				if(i+j<=6)
				{
					if(i%2!=0)
					{
						System.out.print(j);
					}
					else
					{
						System.out.print(7-i-j);
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
