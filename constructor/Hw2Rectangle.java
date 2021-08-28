package constructor;
class Rectangle{
	
	int length;
	int width;
	
	public Rectangle(int length,int width) {

	  this.length=length;
	  this.width=width;
	}
	void area()
	{
		System.out.println(length*width);
	}
	void pari()
	{
		System.out.println(2*(length*width));
	}
	
}
public class Hw2Rectangle {

	public static void main(String[] args) {
		  Rectangle r=new Rectangle(4,5);
		  System.out.println("obj");
		  r.area();
		  r.pari();
		  
		  Rectangle r1=new Rectangle(20,10);
		  System.out.println("obj2");
		  r1.area();
		  r1.pari();
		 
	
	}
}
