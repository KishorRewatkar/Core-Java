 package Test;

public class Qno3 {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<10; j++)
			{
				if(j-i<=0)
				{
					System.out.print(j+1);
				}
				else
				{
					if(i+j>8)
					{
						System.out.print(Math.abs(j+i-8));
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
