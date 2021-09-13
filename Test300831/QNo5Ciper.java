package Test300831;

import java.util.Scanner;

public class QNo5Ciper {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Ciper Text");
		String s=sc.next();
		s=s.toUpperCase();
		char ca[]=s.toCharArray();
		giveMetheciper(ca);
		
	}
	private static void giveMetheciper(char[] ca) {

		
		for(int i=0; i<ca.length; i++)
		{
			ca[i]=(char)(155-ca[i]);
		}
		for (int i = 0; i < ca.length; i++)
		{
			System.out.print(ca[i]);
		}
		
	}
}
