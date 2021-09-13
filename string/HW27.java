package string;

import java.util.Scanner;

public class HW27 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
	    char[] ca=s.toCharArray();
	      
	    for (int i = 0; i < ca.length; i++)
	    {
			if(ca[i]>='a' && ca[i]<='z')
			{
				ca[i]=(char)((int)ca[i]-32);
			}
			else if(ca[i]>='A' && ca[i]<='Z')
			{
				ca[i]=(char)((int)ca[i]+32);
			}
		}
	    for (int i = 0; i < ca.length; i++)
	    {
			System.out.print(ca[i]);
		}
	}
}
