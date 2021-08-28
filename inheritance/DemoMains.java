package inheritance;

class Dev1{
	
	public Dev1() {
		super();
		System.out.println("im in Dev1 cons");

	}
	void add()
	{
		System.out.println("add");
	}
	void mul(){
		System.out.println("mul");
	}
}
class Dev2 extends Dev1{
	public Dev2() {
		super();
	  System.out.println("im in Dev2 cons");
	}
	void div()
	{
		System.out.println("div");
	}
	void sub()
	{
		System.out.println("sub");
	}
}
public class DemoMains{

	public static void main(String[] args) {
		Dev2 d2=new Dev2();
		d2.add();
		d2.mul();
		d2.div();
		d2.sub();
	}
}
