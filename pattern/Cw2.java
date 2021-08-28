package pattern;

import java.util.Scanner;

public class Cw2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int expo, exponet, power = 1,base;
		
		
		System.out.println("Enter the base");
		base=sc.nextInt();
		System.out.println("Enter the Expo");
		exponet=sc.nextInt();
		expo=exponet;
		
		while(exponet!=0)
		{
			power=power*base;
			
			--exponet;
		}
		System.out.println(base+" "+expo+" "+power);
		
	}
}
