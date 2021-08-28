package Arrays;

class student{
	

	int roln;
	String name;
	int marks;
	public student(int roln, String name, int marks) 
	{
		super();
		this.roln = roln;
		this.name = name;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return "student [roln=" + roln + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
public class Hw25 {

	public static void main(String[] args) {
		

		student s1=new student(12, "abhish", 23);
		student s2=new student(34, "chetan", 32);
		student s3=new student(56, "dholye", 24);
		student s4=new student(17, "enna", 23);
		student s5=new student(22, "farank", 86);
		student s6=new student(15, "ishan", 95);
		student s7=new student(18, "jack", 43);
		student s8=new student(11, "kishor", 45);
		student s9=new student(13, "lamio", 76);
		student s10=new student(52, "nitish", 53);
		
		student[] s= {s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};
		
		
	
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < s.length; i++)
		{
		 for (int j = i+1; j < s.length; j++) 
		 {
			if(i<j && s[i].marks<s[j].marks)
			{
				student k=s[i];
				s[i]=s[j];
				s[j]=k;
			}
		 }	
		 if(s[i].marks >max)
		 {
			 max=s[i].marks;
		 }
		 
		}
		System.out.println(max);
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].name+" "+s[i].marks+" "+s[i].roln+" ");
		}
		
		
	}
}
