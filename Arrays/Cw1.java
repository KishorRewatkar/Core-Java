package Arrays;

import java.util.Arrays;

public class Cw1 {

	public static void main(String[] args) {
		
		
		int a[]= {1,63,82,38,72,16};
		
		int sum=0;
	
		System.out.println(	givemethesum(a,sum));
		
	}

	private static int givemethesum(int[] a, int sum) {

		int i;
		for(i=0; i<a.length; i++)
		{
			sum=sum+a[i];
		}
		return sum/a.length;
	}
}
