package Arrays;

import java.util.Arrays;

public class Hw14equality {

	public static void main(String[] args) {
		
		int a[]= {1,1,2,3,4,8,6,5,8,9};
		int b[]= {1,1,2,3,4,8,6,5,8,9};
		
		if(Arrays.equals(a, b))
			System.out.println("same");
		else
			System.out.println("not same");
	
		System.out.println("~~~~~~~~~~");
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
		
		System.out.println("~~~~~~~~~~~~~");
		if(a.length==b.length)
		{
			boolean areTheysame=true;
			{
				for(int i=0; i<b.length; i++)
				{
					if(a[i]!=b[i])
					{
						areTheysame=false;
						break;
					}
				}
				if(areTheysame==true)
					System.out.println("same");
				else
					System.out.println("not same");				
			}
		}
		else 
		{
			System.out.println("not same");
		}
		
		
//		int counter=0;
//		boolean flag=false;
//		if(a.length==b.length)
//		{
//			for(int i=0; i<a.length; i++)
//			{
//				flag=false;
//				for(int j=0; j<b.length; j++)
//				{
//					if(a[i]==b[j])
//					{
//						flag=true;
//					     break;
//					}
//				}
//				if(flag==false)
//				{
//					System.out.println("its not same");
//					counter=1;
//				}
//					
//			}
//			if(counter==0)
//			{
//				System.out.println("same");
//			}
//		}
//		else
//		{
//			System.out.println("not same");
//		}
		
	}
}
