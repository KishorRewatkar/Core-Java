package staticEx;

 class abcd{

	static int num1;
	
	static void add(int num2, int num3)
	{
		
		System.out.println(num2+num3);
	}
	static void add(int num2, int num3, int num4)
	{
		System.out.println(num2+num3+num4);
	}
	
}
 class abcd2 extends abcd{
	static void add(int num2, int num3)
	{
		System.out.println(num2+num3);
	}
	static void add(int num2, int num3, int num4)
	{
		
	}
	
}
public class StaticMAin {

	public static void main(String[] args) {
		//in when we make static as instance veriable this will be
		//memory allow in heap memory area now the value are in class whenever 
		//we update
		abcd ab=new abcd();
	    ab.num1=5;
//	    System.out.println(ab.num1);
	    abcd ab2=new abcd();
	    ab2.num1=10;
	    
	    System.out.println(ab.num1);
	    System.out.println(ab2.num1);
	    
	    System.out.println("~~~~~~~~~~~~");  
	    
	    abcd.num1=5;
	    System.out.println(abcd.num1);
	    System.out.println("~~~~~~~~~~~~~");
	    
 
	}
}
