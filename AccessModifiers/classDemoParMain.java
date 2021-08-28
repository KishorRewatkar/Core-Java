package AccessModifiers;

public class classDemoParMain {

	public static void main(String[] args) {
		ClassDemoParmiterized cdp=new ClassDemoParmiterized();
		cdp.add();
		int c=cdp.sub();
		System.out.println(c);
		int d=cdp.mul(10, 20, 0);
		System.out.println(d);	
		System.out.println(cdp.sub());
	}
}
