package inheritance;

 class test1{

	int num1;
	int num2;
	
 }
 class test2 extends test1{
	int num3;
 }
 
public class Cw1Main {
	public static void main(String[] args) {
		
		test2 t2=new test2();
		t2.num1=5;
		t2.num2=10;
		t2.num3=50;
		System.out.println(t2.num1);
		System.out.println(t2.num2);	
		System.out.println(t2.num3);
			
	}
}
