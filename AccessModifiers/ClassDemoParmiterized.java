package AccessModifiers;

public class ClassDemoParmiterized {

	public void add()
	{
		int a=10;
		int b=29;
		System.out.println(a+b);
	}
	public int sub()
	{
		int a=10;
		int b=20;
		int c=a-b;
		return c;
	}
	public int mul(int a, int b,int c)
	{
		 a=10;
		 b=20;
		 c=a*b;
		 return c;
		 
		
	}
	public void div(int a,int b)
	{
		a=10;
		b=5;
		System.out.println(a/b);
	}
}
