package Arrays;

import java.util.Arrays;

public class Cw2BinarySerch {

	public static void main(String[] args) 
	{
		int a[]= {1,20,46,68,98,99,100};
		int b=98;
		int min=0; 
		int max=a.length-1;
		int mid=a[min+max]/2;
		
	
		System.out.println("I found at index="+Arrays.binarySearch
				(a, 68));

		
//		int b=98;
//		int min=0;
//		int max=a.length-1;
//		int mid=a[min+max]/2;
//		
//		while(min>max)
//		{
//			 mid=a[min+max]/2;
//
//			if(a[mid]==b)
//			{
//				System.out.println("i found index"+mid);
//			}
//			else if(b>a[mid])
//			{
//				min=min+1;
//			}
//			else
//			{
//				max=max-1;
//			}
//		}
	}

	private static int giveMebinary(int[] a, int b, int min, int max, int mid) {

		while(min>max)
		{
			mid=a[min+max]/2;
			
			if(a[mid]==b)
			{
				System.out.println("i found at index"+Math.abs(mid));
			}
			else if(b>a[max])
			{
				min=min+1;
				
			}
			else
			{
				max=max-1;
			}
		}
		return Math.abs(mid);
	
		
	}
}
		
	
		
