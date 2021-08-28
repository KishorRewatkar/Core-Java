package constructor;

public class DmoMains {

	public static void main(String[] args) {
		System.out.println("before cons");
		Demo d=new Demo(13,23);
		System.out.println("after cons");
		System.out.println(d.i);
		System.out.println(d.j);
	}
}
