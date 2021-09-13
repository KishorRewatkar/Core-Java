package ExceptionHandling;


class InvalidCoUNtryException extends ArithmeticException{
	
	InvalidCoUNtryException(String s)
	{
		super(s);
	}
}
class InvalidAgeException extends NullPointerException
{
	InvalidAgeException(String s)
	{
		super(s);
	}
	InvalidAgeException()
	{
		
	}
}
class UserRegistration{
	
	public void registerProfile(String name,int age,String country)
	{
		if(country.compareToIgnoreCase("india")!=0)
		{
			throw new InvalidCoUNtryException("User not from india");
		}
		else if(age<=18)
		{
			throw new InvalidAgeException("user is minor");
		}
		else 
		{
			System.out.println("welcome to india");
		}
	}
}
public class Hw9 {

	public static void main(String[] args) {
		
		UserRegistration r=new UserRegistration();
		r.registerProfile("kishor", 19, "India");
	}
}
