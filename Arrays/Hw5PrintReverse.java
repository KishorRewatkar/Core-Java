package Arrays;

import java.util.Arrays;

public class Hw5PrintReverse {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		
//		giveMeReversenum(a);
//		System.out.println(Arrays.toString(a));
		
		int j=a.length-1;
		for(int i=0; i<a.length/2; i++)
		{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			    j--;
			
		}
		for(int p:a)
		{
			System.out.print(p);
		}
		System.out.println();
		
	} 
	private static void giveMeReversenum(int[] a)
	{
		int j=a.length-1;
		for (int i = 0; i < a.length/2; i++)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			j--;
		}
		
	}

//		int j=a.length-1;
//		for (int i = 0; i < a.length/2; i++)
//		{
//			int temp=a[i];
//			a[i]=a[j];
//			a[j]=temp;
//			j--;
//		}
//		for(int i=0; i<a.length; i++)
//		{
//			System.out.println(a[i]);
//		}
		
//		
//	    for (int i =  a.length-1; i>=0; i--)
//	    {
//			System.out.println(a[i]);
//		}
	    
	    
	}

