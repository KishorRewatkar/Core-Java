package OOPS;

import java.util.Scanner;

public class Hw1 {

	int basicSalary;
	int experiance;
	public void salarywithdiwalibonus()
	{
		if(experiance<5)
		{
			System.out.println(1.35*basicSalary);
		}
		else
		{
			System.out.println(1.15*basicSalary);
		}
	}
}
