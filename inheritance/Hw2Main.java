package inheritance;
class Vechicle{
	
	String Vname;
	int VmodelNo;
	int Vprice;
	String VserviceStationName;
	
	public Vechicle() {
		
	}
	public void DisplayD(String Vname,int VmodelNo,int Vprice,String VserviceStationName)
	{
		
		this.Vname=Vname;
		this.VmodelNo=VmodelNo;
		this.Vprice=Vprice;
		this.VserviceStationName=VserviceStationName;
		System.out.println(Vname+" "+VmodelNo+" "+Vprice+" "+VserviceStationName);

		
	}
}
class bike extends Vechicle{
	
	double discountRate;
	String bname;
	int bmodelN;
	int bprice;
	String bServiceStationName;

	public bike() 
	{
		
	}
	public void displayd(String bname,int bmodelN,int bprice,String bServiceStationName,double discountRate)
	{
		this.bname=bname;
		this.bmodelN=bmodelN;
		this.bprice=bprice;
		this.bServiceStationName=bServiceStationName;
		this.discountRate=discountRate;
		System.out.println(bname+" "+bmodelN+" "+bprice+" "+bServiceStationName+" "+discountRate);
	}
	public void discount(double discountRate)
	{
		this.discountRate=discountRate;
		double discountRe=bprice*discountRate;
		System.out.println("After bike discount= "+discountRe);
	}
}

public class Hw2Main {

	public static void main(String[] args) {
		
		bike b=new bike();
		b.DisplayD("Maruti", 123, 20000, "nagpur");
		b.displayd("splender", 23232, 60000, "Nagpur", 15);		
		b.discount(0.25);
	}
}
