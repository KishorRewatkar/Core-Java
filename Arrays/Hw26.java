package Arrays;

public class Hw26 {

	public static void main(String[] args) {
		
		int []a= {3,7,90,20,5,50,40};
		
		int k=3;
		int leastAvg=Integer.MAX_VALUE;
		int index=0;
		
		for(int i=0; i<a.length-(k-1); i++)
		{
			int sum=0;
			
			for(int j=i; j<i+k; j++)
			{
				sum=sum+a[j];
			}
			int avg=sum/k;
			if(avg<leastAvg)
			{
				leastAvg=avg;
				index=i;
			}
		}
		System.out.println(leastAvg);
		System.out.println(index);
		for(int i=index; i<index+k; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
//		int k=3;
//		int leastAvg=Integer.MAX_VALUE;
//		int index=0;
//		
//		for(int i=0; i<a.length-(k-1); i++)
//		{
//			int sum=0;
//			for(int j=i; j<i+k; j++)
//			{
//				sum=sum+a[j];				
//			}
//			int avg=sum/k;
//			if(avg<leastAvg)
//			{
//				leastAvg=avg;
//				index=i;
//			}			
//		}
//		System.out.println(leastAvg);
//		System.out.println(index);
//		for(int i=index; i<index+k; i++)
//		{
//			System.out.print(a[i]+" ");
//		}
		
	}
}
