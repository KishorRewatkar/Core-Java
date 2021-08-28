package inheritance;

class Department{
	
	String Dname;
	String HODName;
	
	public Department(String Dname,String HODName,String MeberQulification,String MebmberName) 
	{
		
		this.Dname=Dname;
		this.HODName=HODName;
	}
	public void ShowDdetails()
	{
		System.out.println("dname"+Dname);
		System.out.println("hodname"+HODName);
	}
	
}
class staffMembers extends Department{
	
	String MemberName;
	String MemberQualification;
	
	 staffMembers(String MemberName,String MemberQualification)
	{
		super(MemberQualification, MemberQualification, MemberName, MemberQualification);
		this.MemberName=MemberName;
		this.MemberQualification=MemberQualification;
	}
	public void showstaffMemberDetails() 
	{
		System.out.println(MemberName);
		System.out.println(MemberQualification);
	}
}
public class Cw5Main {

	public static void main(String[] args) {
		Department d=new Department("it", "pallavi","Mphill","puri");
		d.ShowDdetails();
		
		
	}
}
