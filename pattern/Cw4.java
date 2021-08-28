package pattern;

public class Cw4 {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(i+j<=4)
					System.out.print(i+j+1);
				else
					if( j-i<=-5)
					   System.out.print(Math.abs(i-j-10));
					else
						System.out.print(" ");
			}
			System.out.println(" ");
			
		}
	}
}
