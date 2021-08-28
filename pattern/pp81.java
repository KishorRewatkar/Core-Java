package pattern;

public class pp81 {

	public static void main(String[] args) {
	
		int cnt=1;
		for(int i=0; i<=4; i++)
		{
			for(int j=0; j<=9; j++)
			{
				if(j-i<=0)
				{
				  System.out.print(j+1);
				}
				else 
				{
					int a=5;
					if(j+i>=9)
					{
						System.out.print(Math.abs(j-5-3));
					}
					else
					{
						System.out.print(" ");
					}
					
				}
			}
			System.out.println(" ");
		}
	}
}
