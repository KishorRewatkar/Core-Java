package Arrays;

class student3{
	
	int rollNo;
	String name;
	int marks;
	public student3(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "student3 [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
	public class Hw25Main2 {

	public static void main(String[] args) {
		
		student3 s1=new student3(12,"punit", 39);
		student3 s2=new student3(14,"manish", 30);
		student3 s3=new student3(15,"suresh", 25);
		student3 s4=new student3(16,"jitesh", 20);
		student3 s5=new student3(17,"kishor", 70);
		student3 s[]= {s1,s2,s3,s4,s5};
		
		for(int i=0; i<s.length; i++)
		{
			for(int j=0; j<s.length; j++)
			{
				if(i<j && s[i].marks>s[j].marks)
				{
					student3 temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		
		for(int i=0; i<s.length; i++)
		{
			System.out.println(s[i]+" ");
		}
	}
	
}
