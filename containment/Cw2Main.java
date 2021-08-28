package containment;
class college{
	
	String collegeName;
	String AddressCollage;
	
	public college(String collegeName, String addressCollage) 
	{
		super();
		this.collegeName = collegeName;
		AddressCollage = addressCollage;
	}
	public void Display()
	{
		System.out.println(collegeName+"  "+AddressCollage);
	}
	
}
class Staff{
	
	String employeeName;
	String AddressEmployee;
	
	public Staff(String employeeName, String addressEmployee) {
		super();
		this.employeeName = employeeName;
		AddressEmployee = addressEmployee;
	}
	public void display()
	{
		System.out.println(employeeName+" "+AddressEmployee);
	}
	
}
public class Cw2Main {

	public static void main(String[] args) {
		college c=new college("piet", "nagpur");
		c.Display();
		Staff s=new Staff("harashal", "nagpyr");
		s.display();
	}
}
