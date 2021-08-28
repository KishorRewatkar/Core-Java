package Arrays;

public class Hw11RemoveDuplicate {

	public static void main(String[] args) {
		
		int a[]= {5,5,83,6,8,2,73,6,8,72,6};	
		int i;
		int j;
		int count=0;
		for( i=0; i<a.length; i++)
		{
			for( j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					count++;
					break;    
				}
			}
		}
		System.out.println("duplicate count="+count);
		int b[]=new int [a.length-count];
		
		int index=0; 
		for(i=1; i<a.length; i++)
		{
			int counter=0;
			for(j=0; j<b.length; j++)
			{
				if(a[i]==b[j])
				{
					counter++;
					
				}
			}
			if(counter==0)
			{
				b[index]=a[i];
				index++;
			}
		}
		for(int p:b)
		{
			System.out.println(p);
		}
		
		

		
		
		
		
		
		
		
//		int a[]= {5,5,83,6,8,2,73,6,8,72,6};
//		
//		int count=0;
//		for(int i=0; i<a.length; i++)
//		{
//			for(int j=i+1; j<a.length; j++)
//			{
//				if(a[i]==a[j])
//				{
//					count++;
//					break;
//				}
//			}
//		}
//		System.out.println("duplicate count+="+count);
//		int b[]=new int[a.length-count];
//		int index=0; 
//		for(int i=0; i<a.length; i++)
//		{
//			boolean flag=true;
//			for(int j=0; j<b.length-1; j++)
//			{
//				if(a[i]==b[j])
//				{
//					flag=false;
//				}		
//			}
//			if(flag)
//			{
//				b[index++]=a[i];
//			}
//		}
//		for(int i=0; i<b.length; i++)
//		{
//			System.out.print(b[i]+" ");
//		}
		
	}
	
}
