package constructor;

public class Cw1Vehical {

	String color="red";
	int wheelCount=4;
	int gearCount=4;
	
	
	Cw1Vehical() 
	{
		System.out.println(color+" "+wheelCount+" "+gearCount);
	}
   Cw1Vehical(String color, int gearCount)
	{
	    this();
		this.color=color;
		this.gearCount=gearCount;
		System.out.println(color+" "+wheelCount+" "+gearCount);

		
	}
}
