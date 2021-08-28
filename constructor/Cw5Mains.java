package constructor;

class Abcd1{
	
	int num1;
	int num2;
	int num3;
	
    Abcd1() 
    {
	 
	}
	 Abcd1(Abcd1 obj1)
	 {
		 num1=obj1.num1;
		 num2=obj1.num2;
		 num3=obj1.num3;
	 }
 Abcd1(int num1, int num2, int num3)
 {
	 this.num1=num1;
	 this.num2=num2;
	 this.num3=num3;
 }

}
public class Cw5Mains {

	public static void main(String[] args) {
		
		Abcd1 obj1=new Abcd1();
		obj1.num1=5;
		obj1.num2=7;
		Abcd1 obj2=new Abcd1(obj1.num1,obj1.num2,obj1.num3);
		
		Abcd1 obj3=new Abcd1(obj1);
		
		obj2.num1=50;
		obj3.num1=500;
		
		System.out.println(obj1.num1+" "+obj1.num2+" "+obj1.num3);
		System.out.println(obj2.num1+" "+obj2.num2+" "+obj2.num3);
		System.out.println(obj3.num1+" "+obj3.num2+" "+obj3.num3);
		
		
	}
}
