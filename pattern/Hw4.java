package pattern;

import java.util.Scanner;

class Hw4{
	   public static void main(String args[]){

		  Scanner scanner = new Scanner(System.in);
		  
	      System.out.println("Enter the number:");
          
	      int num = scanner.nextInt();
	      
	      int factorial = fact(num);
	      
	      System.out.println("Factorial of entered number is: "+factorial);
	   }
	   static int fact(int n)
	   {
	       int output;
	       if(n==1){
	         return 1;
	       }
	       //Recursion: Function calling itself!!
	       output = fact(n-1)* n;
	       return output;
	   }
	}







//
//import java.util.Scanner;
//
//public class Hw4 {
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int fact = 1, i=1,number;
//		number=sc.nextInt();
//		System.out.println(giveMefact(5,1,1));
//		System.out.println(number+" "+fact);
//	}
//
//	private static int giveMefact(int number, int i, int fact) 
//	{
//		for(i=1; i<=number; i++)
//		{
//			fact=fact*i;
//		}
//		return number;
//		
//		
//	}
//}
//int fact=1;
//int i=1;
//int num=6;
//
//for(i=1; i<=num; i++)
//{
//	fact=fact*i;
//
//}
//System.out.println(num+" "+fact);
