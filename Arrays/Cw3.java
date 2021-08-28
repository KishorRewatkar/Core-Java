package Arrays;

import java.util.Arrays;

public class Cw3 {

	public static void main(String[] args) {
		
		int a[]= {6,21,84,63,81,29};
		
		int minindex = 0;
		givemeSelection(a,minindex);
		
		System.out.println(Arrays.toString(a));	
		
		
//		int miniindex;
//		
//		for(int i=0; i<a.length; i++)
//		{
//			miniindex=i; 
//			for(int j=i+1; j<a.length; j++)
//			{
//				if(a[j]>a[miniindex])
//				{
//					miniindex=j;
//				}
//				int temp=a[i];
//				a[i]=a[miniindex];
//				a[miniindex]=temp;
//			}
//		}
//		for(int i=0; i<a.length; i++)
//		{
//			System.out.print(a[i]+" ");
//		}
//		
		
		
		

		
//		int minindex;
//		
//		for (int i = 0; i < a.length; i++) 
//		{
//			minindex=i;
//			for (int j = i+1; j < a.length; j++)
//			{
//				if(a[j]>a[minindex])
//				{
//					minindex=j;
//				}
//				//swap
//				int p=a[j];
//				int q=a[minindex];
//				
//				a[j]=q;
//				a[minindex]=p;
//			}
//			
//		}
//		for (int i = 0; i < a.length; i++) 
//		{
//			System.out.print(" "+a[i]);
//		}	
		}

	private static void givemeSelection(int[] a, int minindex) {

		int i,j,temp;
		for(i=0; i<a.length; i++)
		{
			minindex=i;
			for(j=i+1; j<a.length; j++)
			{
				if(a[j]<a[minindex])
				{
					minindex=j;
				}
				temp=a[i];
				a[i]=a[minindex];
				a[minindex]=temp;
			}
		}
		
	}
}
