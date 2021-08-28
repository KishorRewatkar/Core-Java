package Arrays;

public class Hw16MaxNum {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9,24};
		
		int max=0;
		int min=a.length;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>=max)
			{
				max=a[i];
				
			}
			if(a[i]<=min)
			{
				min=a[i];
			}
		}
		System.out.println("max="+max+" min="+min);

//		int max=Integer.MIN_VALUE;
//		int min=Integer.MAX_VALUE;
//		for(int i=0; i<a.length; i++)
//		{
//			if(a[i]>max && a[i]<min)
//			{
//				max=a[i];
//			}
//		}
//		System.out.println("max num is="+max);
//		
//		//min value;
//				
//		for(int i=0; i<a.length; i++)
//		{
//			if(a[i]<min)
//			{
//				min=a[i];
//			}
//		}
//		System.out.println("minimum number is="+min);
	}
}
