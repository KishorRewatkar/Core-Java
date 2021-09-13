package recurtionProblem;

public class TwoDayArray {

	public static void main(String[] args) {
		
		int a[][]= {{1,2,3},
				{3,5,6},
				{4,6,7}};
		loopi(a,0);
//		for (int i = 0; i < a.length; i++)
//		{
//			for (int j = 0; j < a.length; j++) 
//			{
//				System.out.print(a[i][j]);
//			}
//			System.out.println();
//		}
	}

	private static void loopi(int[][] a,int i) {

		if(i<a.length)
		{
			loopj(a,i,0);
			System.out.println();
			i++;
			loopi(a,i);
		}
	}

	private static void loopj(int[][] a, int i, int j) {

		if(j<a.length)
		{
			System.out.print(a[i][j]);
			j++;
			loopj(a,i,j);
		}
		
	}
}
