package Test2;

import java.util.Arrays;

public class QNo1{
	
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

	}
}
