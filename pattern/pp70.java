package pattern;

public class pp70 {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i=i+2)
		{
			int jcounter=1;
			for(int j=0; j<10; j++)
			{
				if(j-i<=0)
					System.out.print(jcounter+"");				
				if(2*j-i<0)				
					jcounter++;				
				else				
					jcounter--;				
			}
			System.out.println();
		}
	}
}
