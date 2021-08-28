package inheritance;

class DemoHirachical{
	
	public void add()
	{
		System.out.println("im parent");
	}
}
class h1 extends DemoHirachical{
	
	public void mul()
	{
		System.out.println("im child1 subclass1");
	}
}
class h2 extends DemoHirachical{
	
	public void div()
	{
		System.out.println("im child2 subclass2");
	}
}
public class Hw6Main {

	public static void main(String[] args) {
		h2 h=new h2();
		h.add();
		h.div();
        h1 h2=new h1();
        h2.mul();
	}
}
