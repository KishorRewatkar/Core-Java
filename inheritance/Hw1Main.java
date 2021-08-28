package inheritance;



class worker{
	 String Sname;
	 int Sage;
	 int SphoneNum;
	 String Saddress;
	 int Ssalary;
	 
	 public worker(String sname2, int sage2, int sphoneNum2, String saddress2, int ssalary2) 
	 {
		 
	 }
	public void displaySalary(String Sname,int Sage,int SphoneNum, String Saddress,int Ssalary)
	 {
		 this.Sname=Sname;
		 this.Sage=Sage;
		 this.SphoneNum=SphoneNum;
		 this.Saddress=Saddress;
		 this.Ssalary=Ssalary;
		 
		 System.out.println("name "+Sname);
		 System.out.println("age "+Sage);
		 System.out.println("number "+SphoneNum);
		 System.out.println("address "+Saddress);
		 System.out.println("salary "+Ssalary);
	 }
	 public void displaySalary()
	 {
		 System.out.println("Salary "+Ssalary);
	 }
}
	 class Employee extends worker
	 {
		 String workSpcialization;
		 String department;
		 
		 public Employee(String Sname,int Sage, int SphoneNum,String Saddress,int Ssalary)
		 {
			 super(Sname,Sage,SphoneNum,Saddress,Ssalary);
			 this.workSpcialization=workSpcialization;
			 this.department=department;
			 
		 }
		 void displaySal()
		 {
			 super.displaySalary();
			 System.out.println(workSpcialization);
			 System.out.println(department);
		 }
		 public void display()
		    {
		    	System.out.println("name"+Sname+"age="+Sage+"Phone nu="+SphoneNum+"adress="+Saddress+"Salary"+Ssalary);
		    }
			
	     	 
	 }
	 class Manager extends worker
	 {
		 String workSpcialization;
		 String department;
		 
		 public Manager(String sname, int sage, int sphoneNum, String saddress, int ssalary)
		 {
			super(sname, sage, sphoneNum, saddress, ssalary);
			this.workSpcialization=workSpcialization;
			this.department=department;
		}
		 
	    void displayySal()
	    {
	    	System.out.println(workSpcialization);
	    	System.out.println(department);
	    }
	    public void display()
	    {
	    	System.out.println("sname "+Sname+"age "+Sage+" sphone"+SphoneNum+" ssalary"+Ssalary);
	    }
		
	 }
	
	 
public class Hw1Main {
	public static void main(String[] args) {

		Employee e=new Employee("kishor", 23, 423423, "sitaburd", 1000);
		e.displaySalary();
		e.display();

        
	}
}
