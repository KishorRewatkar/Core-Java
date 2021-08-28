package inheritance;

class test
{
	
	public void display1()
	{
		System.out.println("GOOD MORNING");
	}
	public void display2()
	{
		System.out.println("GOOD AFTERNOON");
	}
	

}
class TestingInheritance extends test
{
	public void display3()
	{
		System.out.println("GOOD EVENING");
	}
	
}
public class Cw2Main {

	public static void main(String[] args) {
		TestingInheritance te=new TestingInheritance();
		te.display1();
		te.display2();
		te.display3();
	
		
		
		
		
	}
}
