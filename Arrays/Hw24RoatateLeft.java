package Arrays;

public class Hw24RoatateLeft {

	
	 
	// Driver program to test above functions 
	public static void main(String[] args) 
	{ 
	
       int[]a= {1,2,3,4,5,6,7,8};
		
		int temp=a[0];
		
    	for(int i=0; i<a.length-1; i++)
		{
			a[i]=a[i+1];
		}
		a[7]=temp;
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
		
//		int[]a= {1,2,3,4,5,6,7,8};
		
//		int temp=a[0];
//		
//		for(int i=0; i<a.length; i++)
//		{
//			a[i]=a[i+1];
//		}
//		a[7]=temp;
//		for (int i = 0; i < a.length; i++)
//		{
//			System.out.println(a[i]);
//		}
//		
		
//int temp=a[0];
//		
//		a[0]=a[1];
//		a[1]=a[2];
//		a[2]=a[3];
//		a[3]=a[4];
//		a[4]=a[5];
//		a[5]=a[6];
//		a[6]=a[7];
//		a[7]=temp;
//		for (int i = 0; i < a.length; i++)
//		{
//			System.out.println(a[i]);
//		}
	}
}

