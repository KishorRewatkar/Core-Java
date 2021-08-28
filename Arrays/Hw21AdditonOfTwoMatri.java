package Arrays;

public class Hw21AdditonOfTwoMatri {

	public static void main(String[] args) {
		

		int a[][]={{1,2,3},
				{3,7,5},
				{6,4,3}};

		int b[][]={{2,24,35},
				{33,7,55},
				{6,44,3}};
       int c[][]=new int[3][3];
		
		for (int i = 0; i <c.length; i++) 
		{
			for(int j=0; j<c[i].length; j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0; i<c.length; i++)
		{
			for(int j=0; j<c[i].length; j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
//		int c[][]=new int[3][3];
//		
//		for (int i = 0; i <c.length; i++) 
//		{
//			for(int j=0; j<c[i].length; j++)
//			{
//				c[i][j]=a[i][j]+b[i][j];
//			}
//		}
//		for(int i=0; i<c.length; i++)
//		{
//			for(int j=0; j<c[i].length; j++)
//			{
//				System.out.print(c[i][j]+" ");
//			}
//			System.out.println();
//		}
	
//		int c[][]=new int[3][3];
//		
//		for(int i=0; i<c.length; i++)
//		{
//			for(int j=0; j<c[i].length; j++)
//			{
//				
//				c[i][j]=a[i][j]+b[i][j];
//			}
//		}
//		for(int i=0; i<c.length; i++)
//		{
//			for(int j=0; j<c[i].length; j++)
//			{
//				System.out.print(c[i][j]+" ");
//			}
//			System.out.println();
//		}
	}
}
