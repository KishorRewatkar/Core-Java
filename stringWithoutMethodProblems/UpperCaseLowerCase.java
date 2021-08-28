package stringWithoutMethodProblems;

import java.util.Scanner;

public class UpperCaseLowerCase {

	public static void main(String[] args) {
				
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a Alphabet : ");
		String s=kb.next();
//		String s="KISHOR";
		char[] ca=s.toCharArray();
		for (int i = 0; i < ca.length; i++)
		{
			if(ca[i]>='a' && ca[i]<='z')
			{
				
				ca[i]=(char)((int)ca[i]-32);
				System.out.println("CONVERT IN UPPER");
				
			}
			else if(ca[i]>='A' && ca[i]<='Z')
			{
				ca[i]=(char)((int)ca[i]+32);
				System.out.println("CONVERT INTO LOWER");

			}
		}
		System.out.println();
		for (int i = 0; i < ca.length; i++) 
		{
			System.out.print(ca[i]);
		}
		
		
		
		
		
		
		
		
		
//		ca = kb.next().charAt(0);
//		
//		if (ch >= 97 && ch <= 122)
//		{
////			System.out.println(" = Given Alphabet "+ch+" is Lowercase.");
//			ch=(char) (ch+ch-32);
//			System.out.println(ch);
//		} 
//		else if (ch >= 65 && ch <= 90){
//			System.out.println(" = Given Alphabet "+ch+" is Uppercase.");			
//		}
//		else
//		{
//			System.out.println(" = Entered Value "+ch+" is Not Alphabet.");
//		}
		
//		char ca[]=s.toCharArray();
//		
//		for (int i = 0; i < ca.length; i++) 
//		{
//			if(ca[i]>=97 && ca[i]<=122)
//			{
//				
//				 ca[i]=(char) ((char)ca[i]+(ca[i]-32));
//				
//			}
//		}
//		String s1=new String(ca);
//		System.out.println(s1);
	}
}
