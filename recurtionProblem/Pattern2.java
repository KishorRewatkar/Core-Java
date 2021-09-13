package recurtionProblem;

public class Pattern2 {

	public static void main(String[] args) {
		
		loopi(0);
		
		
		
		
		
		
//		for (int i = 0; i < 5; i++)
//		{
//			for (int j = 0; j <5-i; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
	}

	private static void loopi(int i) {

		if(i<5)
		{
			loopj(i,0);
			System.out.println();
			i++;
			loopi(i);
		}
	}

	private static void loopj(int i, int j) {

		if(j<5)
		{
			if(j+i<=4)
			System.out.print("*");
			else
			{
			System.out.print(" ");
			}
			j++;
			loopj(i,j);
		}
		
	}
}
