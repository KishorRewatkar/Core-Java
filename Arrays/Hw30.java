package Arrays;

public class Hw30 {

	public static void main(String[] args) {

		int []a= {1,1,1,1,1,2,2,3,8,4,5,6,7,7};
		int []n= {1,2,4,7,6,5};
		
		
		for(int j=0; j<n.length; j++)
		{
			int dcount=n[j];
			int count=0;			
			for (int i = 0; i < a.length; i++) 
			{
				if(a[i]==dcount)
				{
					count++;
					
				}
			}
			int b[]=new int[a.length-count];
			int index=0;
			for (int i = 0; i < a.length; i++) 
			{
				if(a[i]!=dcount)
				{
					b[index++]=a[i];
				}
			}
			a=b;
			
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]+" ");
		}
	
		
		
		
		
//		
//		for(int j=0; j<n.length; j++)
//		{
//			int p=n[j];
//			int pcount=0;
//			for (int i = 0; i < a.length; i++) 
//			{
//				if(a[i]==p)
//					pcount++;
//			}
//			int[]b=new int[a.length-pcount];
//			int bindex=0;
//			for(int i=0; i<a.length; i++)
//			{
//				if(a[i]!=p)
//					b[bindex++]=a[i];
//			}
//			a=b;
//		}
//		for (int i = 0; i < a.length; i++)
//		{
//			System.out.print(a[i]+" ");
//		}
//		System.out.println();
	}

}
