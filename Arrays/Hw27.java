package Arrays;

public class Hw27 {

	public static void main(String[] args) {
 	
		int a[]= {2,3,4,5,6,7};
		int b[]= {1};
		int c[]=new int[a.length+b.length];
		
		int index=0;
		
		for(int i=0; i<a.length; i++)
		{
			if(i<a.length)
			c[index++]=a[i];
			if(i<b.length)
			c[index++]=b[i];
			
			
		}
		for (int i = 0; i < c.length; i++)
		{
			System.out.print(c[i]);
		}
		for(int i=0; i<c.length; i++)
		{
			for(int j=i+1; j<c.length; j++)
			{
				if(c[i]>c[j])
				{
					int temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		System.out.println();
		for(int p:c)
		{
			System.out.print(p);
		}
		System.out.println();
		char[] s1= {'a','b','c','d'};
		char[] s2= {'w','x','y','z','p'};
		char[] s3=new char[s1.length+s2.length];
		int s3index=0;
		
		for (int i = 0; i < s2.length; i++) 
		{
			if(i<s1.length)
			s3[s3index++]=s1[i];
			if(i<s2.length)
			s3[s3index++]=s2[i];
		}
		for (int i = 0; i < s3.length; i++) {
			System.out.print(s3[i]+" ");
		}
		
		
//		char[] s1= {'a','b','c','d'};
//		char[] s2= {'w','x','y','z','p'};
//		char[] s3=new char[s1.length+s2.length];
//		int s3index=0;
//		
//		for (int i = 0; i < s2.length; i++) 
//		{
//			if(i<s1.length)
//			s3[s3index++]=s1[i];
//			if(i<s2.length)
//			s3[s3index++]=s2[i];
//		}
//		for (int i = 0; i < s3.length; i++) {
//			System.out.print(s3[i]+" ");
//		}
		
//		char[] s1= {'a','b','c','d'};
//		char[] s2= {'w','x','y','z','p'};
//		char[] s3=new char[s1.length+s2.length];
//		int s3index=0;
//		
//		for (int i = 0; i < s2.length; i++) 
//		{
//			if(i<s1.length)
//			s3[s3index++]=s1[i];
//			if(i<s2.length)
//			s3[s3index++]=s2[i];
//		}
//		for (int i = 0; i < s3.length; i++) {
//			System.out.print(s3[i]+" ");
//		}
	}
}
