package constructor;

class addAmmount
{
	 int ammount=5000;
		
		public addAmmount()
		{
			System.out.println("no ammout to be added in the bank");
		}
		public addAmmount(int ammount)
		{
			this();
			this.ammount=ammount;
			System.out.println("your current ammount is "+ammount);
		}
}
public class Hw3Bank {

   public static void main(String[] args) {
	
	   addAmmount ad1=new addAmmount(7000);
	   
 }
	
}
