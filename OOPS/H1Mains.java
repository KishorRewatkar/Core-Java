package OOPS;

import java.util.Scanner;

public class H1Mains {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Hw1 h=new Hw1();

		System.out.println("Enter the basic Salary");
		h.basicSalary=sc.nextInt();
		System.out.println("Enter the experiance");
		h.experiance=sc.nextInt();
		h.salarywithdiwalibonus();
		sc.close();
		
	}
}
