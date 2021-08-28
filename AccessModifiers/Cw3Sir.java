package AccessModifiers;
class Main3
{
	String name;
	int balance=0;
	public void inputData(String name)
	{
		this.name=name;
	}
	public void displayD()
	{
		
		System.out.println("your name ="+name+" and cuurent balance="+balance);
	}
	public void deposit(int ammount)
	{
		System.out.println("balance added sucessfully");
		balance=balance+ammount;
	}
	public void widrwalD(int ammount)
	{
		System.out.println("balance widrwal succesfully");
		balance=balance-ammount;
		
	}
	public void accBalance()
	{
		System.out.println("your balance is ="+balance);
	}
}
public class Cw3Sir {

	public static void main(String[] args) {
		Main3 mm=new Main3();
		mm.accBalance();
		mm.displayD();
		mm.inputData("somu");
		mm.displayD();
		mm.deposit(1000);
		mm.displayD();
		mm.widrwalD(500);
		mm.displayD();
		mm.accBalance();
	}
}
