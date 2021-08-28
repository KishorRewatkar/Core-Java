package pattern;

public class pp96 {

	public static void main(String[] args) {
		
		for(int i=0; i<=12; i=i+2)
		{
			for(int j=0; j<=12; j++)
			{
		      if(i==2*j)
		      {
		    	  System.out.print("*");
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
