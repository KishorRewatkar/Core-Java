package constructor;
class hw1EmployeesMain{
	String ename="kishor";
	int salary;
	
	public hw1EmployeesMain(String ename, int salary)
	{
		this.ename=ename;
		this.salary=salary;
		
	}
	public  int hw1EmployeesMain(int salary)
	{
		this.salary=salary;
		return salary;
	}

	public void print()
	{
		System.out.println(ename+" salary="+salary);
	}
}
public class Hw1Employees {

	public static void main(String[] args) {
		
		hw1EmployeesMain em=new hw1EmployeesMain("kishor", 500000);
		em.print();
	}
	
}
