package pattern;

import java.util.Scanner;

public class Hw7 {
	
	public static void main(String[] args) {
		
	     Scanner sc=new Scanner(System.in);
	     int num=sc.nextInt();
	     System.out.println(num(num));
	     sc.close();
	}
	private static int num(int num)
	{
		if(num%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
		return num;
	}
}
