package recurtionProblem;

public class Class1 {

	static int a[][]= {{1,2,3},
			{2,3,4},
			{4,5,6}};

	public static void main(String[] args) {
		

		
		int i = 0;
		int j = 0;
	    loopi(i,j);
	}
	private static void loopi(int i,int j)
	{
		
		if(i<a.length)
		{
			loopj(i,j);
			i++;
			loopi(i,j);
		}
				
//		for (i = 0; i < a.length; i++) 
//		{
//			for (j = 0;j< a.length; j++)
//			{
//				System.out.print(a[i][j]);
//			}
//			System.out.println();
//			
//		}
	}
	private static void loopj(int i, int j) {

		if(j<a.length)
		{
			j++;
			loopj(i,j);
			System.out.println(a[i][j]);
		}
	}
}
