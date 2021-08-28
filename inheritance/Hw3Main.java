package inheritance;

class Square{
	int side;
	int area;
	public void area()
	{
	  this.area=area;
	  this.side=side;
	  area=side*side;
	System.out.println(area+ "area3");
  
	}
	Square()
	{
		
	}
	
}
class Rectangle extends Square{
	
	Rectangle()
	{
		
	}
	int length;
	int breadth;
	int area;
	
	public void area(int length, int breadth,int area)
	{
		this.breadth=breadth;
		this.length=length;
		this.area=area;
	    area=length*breadth;
	    System.out.println(area);
	}
}
class Triangle extends Rectangle{
	
	int side1;
	int side2;
	int side3;
	int area;
	
	public void area(int side1,int side2, int side3)
	{
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
		area=side1*side2*side3;
		System.out.println(area);
	}
	
}
public class Hw3Main {

	public static void main(String[] args) {
		
		Triangle t=new Triangle();
		t.area();
		t.area(10, 20, 20);
		t.area();
		


	}
}
