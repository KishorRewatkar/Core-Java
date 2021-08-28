package pattern;

public class pp77 {

	public static void main(String[] args) {
		
		int icounter=1;
		for(int i=1; i<6; i++)
		{
		 int jcounter=icounter;
		 int differnce=4;
		 	 
		for(int j=0; j<i; j++)
		{
		  System.out.print(jcounter+" ");
		  jcounter=jcounter+differnce;
		  differnce--;
		}
			System.out.println();
			icounter++;
		 }
		}
	}

