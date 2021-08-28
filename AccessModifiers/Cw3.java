package AccessModifiers;

import java.util.Scanner;

public class Cw3 {

	
	static Scanner sc=new Scanner(System.in);

	
	 static	String name;
	static 	int AccountNo;
	static	String Address;
	static	long mobileNo;
    static   int ammount;
	static	int add;
	static	int wid;
	static	int widrwal;
	static  int cheak;
		
	public void inputData()
	{
		System.out.println("enter the name");
		name=sc.next();
		System.out.println("enter the account no");
		AccountNo=sc.nextInt();
		System.out.println("enter the address");
		Address=sc.next();
		System.out.println("enter the mobile number");
		mobileNo=sc.nextLong();
		System.out.println("enter the ammount you want to add");
		ammount=sc.nextInt();
		
	}
	public void displayData()
	{
		System.out.println("coustmour Name"+name);
		System.out.println("AccountNo"+AccountNo);
		System.out.println("Adress"+Address);
		System.out.println("mobileno"+mobileNo);
	}
	public void depositAmmount()
	{
		add=add+ammount;
		
		System.out.println("ammount added sucussfully ="+add);
	}
	public void widAmmount()
	{
		System.out.println("enter the ammount you want to widrawal");
		widrwal=sc.nextInt();
		widrwal=widrwal-add;
        System.out.println("ammount widrwal successfully remaining balance is ="+Math.abs(widrwal));
	}
	public void chekBalance()
	{
		System.out.println("enter the account number to cheak balance");
			
			cheak=sc.nextInt();
			if(cheak==AccountNo)
			{
				System.out.println("your balance is "+Math.abs(widrwal));
				System.out.println("Thank you for banking with us! :)");
			}
			else
			{
				System.out.println("please enter the valid accout number");
				chekBalance();
			}
					
		sc.close();
		
	}
	
}
