package OOPS;

import java.util.Scanner;

public class Hw2Main {

	public static void main(String[] args) {
		 System.out.println("Welcome");
		 System.out.println("Enter the options:\n 1) add \n 2) sub \n 3) mul n 4) Exit");
         Scanner sc=new Scanner(System.in);
         Hw2 h=new Hw2();
    
         int choice=sc.nextInt();
         switch (choice) 
         {
		case 1: {
			h.add();
		}
		case 2: {
			    h.sub();
		}
		case 3:{
			    h.mul();
		}
		case 4:{
			    System.out.println("Enter the valid input");
		}
		default: System.out.println("Enter the valid input Exit");			
        }
         sc.close();
	}
}
