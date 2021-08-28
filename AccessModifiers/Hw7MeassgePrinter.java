package AccessModifiers;

   class outerClass
	{
		public void printMeassge(String name)
		{
			System.out.println(name);
		}
	}
public class Hw7MeassgePrinter {

	public static void main(String[] args) {
		outerClass o=new outerClass();
		o.printMeassge("kishor");
	}
}
