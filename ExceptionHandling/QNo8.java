package ExceptionHandling;

class Demo{
	
	public int devision(int Diveident ,int devisor)
	{
		if(devisor==0)
		{
			throw new ArithmeticException("No devisible");
		}
		return Diveident/devisor;
	}
}


public class QNo8 {

	public static void main(String[] args) {
		
		Demo d=new Demo();
		int result=0;
		try
		{
		 result=(d.devision(10, 2));

		}
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException  is thrown");
		}
		finally {

			System.out.println("result "+result);
		}
		
	
	}
}
