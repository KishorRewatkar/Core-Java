package AccessModifiers;

  class outerClass1
  {
	  int area=10;
	public int calculateArea(int length)
	{
		length=area*area;
		System.out.println(length);
		return length;
		
	}
  }
public class Hw8Square {

	  public static void main(String[] args) {

		  outerClass1 oc=new outerClass1();
		  oc.calculateArea(10);
	}
}
