package containment;
class Address{
	
	int StreetNo;
	String city;
	String state;
	String country;
	public Address(int  StreetNo, String city, String state, String country) {
		super();
		this.StreetNo = StreetNo;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
}
class Person {
	String PName;
	int AdharNo;
	String PjobName;
	int pjobId;
	String PjobLocation;
	
	public Person(String pName, int adharNo, String pjobName, int pjobId, String pjobLocation) {
		super();
		PName = pName;
		AdharNo = adharNo;
		PjobName = pjobName;
		this.pjobId = pjobId;
		PjobLocation = pjobLocation;
	}
	Address obj=new Address(20, "Nagpur", "Maha", "india");

	public void displayPersonDetails()
	{
		System.out.println("pname "+PName+" "+"padhar no "+AdharNo+" PjobName "+PjobName+" pjobId "+pjobId+" PjobLocation "+PjobLocation);
	}
	
}
public class Cw1Main {

	public static void main(String[] args) {
		
		Person p=new Person("kishor", 1323, "software d", 123, "nagpur");
		p.displayPersonDetails();
		
		
	}
}
