package constructor;
class Hw4progammingMains{
  String name;
	
	public Hw4progammingMains(String name)
	{
		this.name=name="i want to learn java";
		System.out.println(name);
    }
	Hw4progammingMains()
	{
		System.out.println("i want to learn langudge");
	}
}
public class Hw4programming {

	public static void main(String[] args) {
		Hw4progammingMains h4=new Hw4progammingMains("java");
	}
}
 