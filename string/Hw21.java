package string;

public class Hw21 {

	public static void main(String[] args) {
	String s="abcdabcabd";
	int max=Integer.MIN_VALUE;
	int start=0;
	for (int i = 0; i <s.length(); i++) 
	{
		for (int j = i+1; j < s.length(); j++)
		{
			int count=0;
			for (int k = i; k <j; k++) 
			{
				count++;
				break;
			}
			if(count==1)
			{
				if(max<j-i)
				{
				max=j-i;
				start=i;
				}
				break;
			}
			if(j==s.length()-1)
			{
				if(max<j-i-1)
				{
				  max=j-i-1;
				  start=i;
				}
				break;
			}
		}
	}
	for (int i = start; i < start+max; i++) 
	{
		System.out.println(s.charAt(i));
	}
	System.out.println(max);
	
	
	
	
	
	
	
	
	
	
//		int max=Integer.MIN_VALUE;
//		int start=0;
//		for (int i = 0; i <s.length(); i++) 
//		{
//			for (int j = i+1; j <s.length(); j++)
//			{
//				int count=0;
//				for(int k=i; k<j; k++)
//				{
//					if(s.charAt(j)==s.charAt(k))
//					{
//						count++;
//						break;
//					}
//				}
//				if(count==1)
//				{					
//					if(max<j-i)
//					{
//			     		max=j-i;
//						start=i;
//					}
//					break;
//				}
//				if(j==s.length()-1)
//				{
//					
//					if(max<j-i+1)
//					{
//						max=j-i+1;
//						start=i;
//					}
//					break;
//				}
//			}
//		}
//		for (int i = start; i < start+max; i++)
//		{
//			System.out.print(s.charAt(i));
//		}
//		System.out.println();
//		System.out.println(max);
	}
}
