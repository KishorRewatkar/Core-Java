package Arrays;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		
		int a[]= {1,3,-4,5,6,7,8};
		int b[]= {1};

		int count=0;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<0)
				{
					count++;
					
				}
			}
		}
		int temp=0;
		for(int i=0; i<a.length; i++)
		{
			if(i==count)
			{
			    temp=count;
				count=a[0];
				a[0]=temp;
			}
		}
		int c[]=new int[a.length+b.length];
		int aindex=0;
		int bindex=0;
				
		for(int i=0; i<a.length; i++)
		{
			if(i<a.length)
				c[i]=a[aindex++];
			if(i<b.length)
			    c[i]=b[bindex++];
			
		}
		for(int i=0; i<c.length; i++)
		{
			System.out.println(c[i]+" ");
		}
	}
}
