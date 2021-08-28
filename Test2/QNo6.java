package Test2;

public class QNo6 {

	public static void main(String[] args) {
		
		for(int i=0; i<=30; i=i+4)
		{
			for(int j=0; j<=30; j=j+6)
			{
			  if(j-i<=0)
			  {
				  if(i!=2 && i!=5)
				  {
					  System.out.print("*");
				  }
				  else
				  {
					  System.out.print("");
				  }
				  
				     
			  }
			  else
				  System.out.print(" ");
			}
			
			System.out.println(" ");
		}
	}
}
