package Arrays;

class student2{
	
	int rollNo;
	String name;
	int marks;

	public student2(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
}
public class Hw25Main {

	public static void main(String[] args) {
		
		student2 s1=new student2(2, "Kishor", 80);
		student2 s2=new student2(5, "Nilesh", 9);
		student2 s3=new student2(3, "pankaj", 82);
		student2 s4=new student2(9, "Sumit", 63);
		student2 s5=new student2(7, "Naresh", 14);
		student2 s6=new student2(23, "Hasan", 67);
		student2 s7=new student2(53, "Milind", 26);
		student2 s8=new student2(6, "somay", 74);
		student2 s9=new student2(8,"sujata", 46);
		student2 s10=new student2(10, "gomy", 85);
		
		student2[] s= {s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};
		
		int max=0;
		for(int i=0; i<s.length; i++)
		{
			for(int j=i+1; j<s.length; j++)
			{
				if(i<j && s[i].marks<s[j].marks)
				{
					student2 k=s[i];
					s[i]=s[j];
					s[j]=k;
				}
				
			}
			
		 s[i].rollNo=i+1;
		}

		System.out.println("max="+max);
			
		for (int i = 0; i < s.length; i++) 
		{
			System.out.print(s[i]+"\n ");
		}
				
				
		
	}
}
