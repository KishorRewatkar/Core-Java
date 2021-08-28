package Test;

public class Qno8 {

	public static void main(String[] args) {

		for(int i=0; i<=10; i=i+2)
		{
			for(int j=0; j<=10; j++)
			{
				if(i==2*j)
				{
					System.out.print(" ");
				}
				else if(j-i<=0)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
