package Test;

public class Qno4 {

	public static void main(String[] args) 
	{
		for (int i = 0; i <7; i++)
		{
		 for (int j = 0; j <5; j++) 
		 {
		   if(i==0 || j==0 || i==3 || i==6 || j==4)
		   {
			   if((j==4 && i==0) || (j==4 && i==6) || (i==3 && j==4))
			   {
				   System.out.print(" ");
			   }
			   else
			   {
				   System.out.print("*");
			   }
			   
		   }
		   else
		   {
			   System.out.print(" ");
		   }
		}	
		 System.out.println(" ");
		}
	}
}
