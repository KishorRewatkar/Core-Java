package Test300831;

import java.util.Scanner;

public class Q_no8longestSubString {

	public static void main(String[] args) {
		
//	String s="abdlsabcdjdkd";
	//            i  j
	//
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String s=sc.next();
	int max=Integer.MIN_VALUE;
	int start=0;
	giveMEtheLongestSubString(s,max,start);
	
	}
	private static void giveMEtheLongestSubString(String s, int max, int start) {

		for(int i=0; i<s.length(); i++)
		{
			int j=i+1; 
			boolean present=false;
			for(; j<s.length(); j++)
			{
				for (int k = i; k <j; k++)
				{
					if(s.charAt(j)==s.charAt(k))
					{
						present=true;
						break;
					}
				}
				if(present)
					break;
				if(max<j-i)
				{
					max=j-i;
					start=i;
				}
			}
			
		}
		System.out.println("max "+max);
		for(int i=start;  i<start+max; i++)
		{
			System.out.print(s.charAt(i));
		}
		
	}
}
	
	
	
	
	
	
	
	
	
