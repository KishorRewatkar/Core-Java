package Arrays;

import java.util.Arrays;

public class Cw4InsertionSort {

	public static void main(String[] args) {
		
		int a[]= {2,93,49,82,73,90,20,9};
		
		giveMeinsertionSort(a);
		System.out.println(Arrays.toString(a));
		
	}

	private static void giveMeinsertionSort(int[] a) {

		int i,j,temp;
		for(i=0; i<a.length; i++)
		{
			for(j=0; j<a.length; j++)
			{
				if(i<j && a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
}
