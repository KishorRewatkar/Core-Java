package constructor;
class cw3main
 {
	 cw3main(int a,int num,int num1,int num2)
	{
	   a=3;
	  if(a%2==0)
		  System.out.println("even");
	  else
		  System.out.println("odd");
	  
	  
	  System.out.println("~~~~~~~~~~~~~");
	  
	  int fact=1;
	  num=5;
	  int i = 1;
	  do
	  {
		  fact=fact*i;
		  i++;
	  }
	   while(i<=num);
	   {
		   System.out.println("factorial of number "+num+" "+fact);
	   }  	 
      System.out.println("~~~~~~~~~~~~");
  
      num1=20;
      num2=30;
      System.out.println(num1+num2);
	}
 }	
 

public class Cw3 {

	public static void main(String[] args) {
		
		cw3main m=new cw3main(24,5,20,10);
	}
}
