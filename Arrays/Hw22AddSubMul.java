package Arrays;

import java.util.Scanner;

public class Hw22AddSubMul {

	public static void main(String[] args) {
		
		int a[][]={{3,4,5},
					{6,7,8},
				};

		int b[][]={{1,2},
					{3,4},
					{5,6}};
		
		int c[][]=new int[2][2];
		
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
				for(int k=0; k<3; k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		for(int i=0; i<c.length; i++)
		{
			for(int j=0; j<c.length; j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		
	
//int c[][]=new int[2][2];
//		
//		for(int i=0; i<2; i++)
//		{
//			for(int j=0; j<2; j++)
//			{
//				for(int k=0; k<3; k++)
//				{
//					c[i][j]=c[i][j]+a[i][k]*b[k][j];
//				}
//			}
//		}
//		for(int i=0; i<c.length; i++)
//		{
//			for(int j=0; j<c.length; j++)
//			{
//				System.out.print(c[i][j]+" ");
//			}
//			System.out.println();
//		}
			
		
		
		
		
//		for(int i=0; i<2; i++)
//		{
//			for(int j=0; j<2; j++)
//			{
//             for (int k = 0; k<3; k++) 
//             {
//				c[i][j]=c[i][j]+a[i][k]*b[k][j];
//			 }							
//			}		
//		}
//	
//		for (int i = 0; i < c.length; i++)
//		{
//			for (int j = 0; j < c.length; j++) {
//				
//				System.out.print(c[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
	}
}
