package constructor;
class Circle{
	int area;
	int pi=10;
	
	int result;
	public int CirculeArea(float radius)
	{
		System.out.println("im from circule area");
		area=(int) (pi*radius*radius);
		return area;
	}
	public int  Circumference(float radius)
	{
		System.out.println("im form circumference");
		result=(int) (2*pi*radius);
		return result;
	}
}

public class Hw6Mains {

	public static void main(String[] args) {
		Circle c=new Circle();
		int b=c.CirculeArea(20);
		System.out.println(b);
		int k=c.Circumference(30);
		System.out.println(k);
	}
}
