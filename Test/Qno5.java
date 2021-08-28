package Test;

public class Qno5 {

	public static void main(String[] args) {
	
		int icount=0;
		for(int i=0; i<6; i++)
		{
			int jcount=icount;
			int diff=5;
			for(int j=0; j<6; j++)
			{
				if(j-i<=0)
				{
					System.out.print((char)(jcount+65));
					jcount=jcount+diff;
				}				
				else
					System.out.print(" ");
			}
			System.out.println();
			icount++;
		}
	}
}
