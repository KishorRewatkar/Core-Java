package ExceptionHandling;


public class Hw10 {

	static int a=1;
	public static void main(String[] args){
		System.out.println("im in main");
		try
		{
			m1();
		}
		catch (Exception e) {
		}
		System.out.println("out main");
	}
	private static void m1() throws Exception
	{
		System.out.println("im in m1");
		m2();
		System.out.println("out  m1");
	}
	private static void m2() throws Exception{
		System.out.println("im in m2");
		m3();
		System.out.println("out  m2");
	}
	private static void m3() throws Exception{
		System.out.println("im  in m3");
		if(a==1)
		throw new Exception();
		System.out.println("out m3");
	}
}
