package Arrays;

public class Basic {


	public static void main(String[] args) {
		
		
		int a[] = {1,2,3,4,5,6,7};
		System.out.println(giveMesum(a, 0));


		int b[]=new  int[10];
System.out.println("hi");

		System.out.println(a.length);
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		//addition of array
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];			
		}
		System.out.println(sum);
	   

	}

	private static int  giveMesum(int[] a, int sum) 
	{
		for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
		}
		
		return sum;
		
	}
}

