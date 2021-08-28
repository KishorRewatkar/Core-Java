package pattern;

public class Hw3 {

	public static void main(String[] args) {
		int num=14;
		
		boolean prime=false;
		for(int i=2; i<num/2; ++i)
		{
			if(num%i==0)
			{
				prime=true;
				break;
			}
		}
		if(!prime)
		{
			System.out.println("its prime numbe ="+num);
		}
		else
		{
			System.out.println("not prime number = "+num);
		}
	
	}
}
