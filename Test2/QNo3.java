package Test2;

import java.util.Arrays;

public class QNo3 {

	public static void main(String[] args) {
		
		int a[]= {2,3,4,5,6};
		int b[]= {2,3,4,5,6};
		
		if(Arrays.equals(a, b))
		{
			System.out.println("its same");
		}
		else
		{
			System.out.println("not same");
		}
		
		if(a.length==b.length)
		{				
				int i=0;
				for(; i<b.length; i++)
				{
					if(a[i]!=b[i])
					{					
						break;
					}
				}
				if(i==b.length)
					System.out.println("same");
				else
					System.out.println("not same");				
		}
		else
			System.out.println("not same");
	}
}
