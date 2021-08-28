package pattern;

public class p6 {

	public static void main(String[] args) {
		
		//1 1 1 2 1 3
		//2 1 2 2 2 3
		//3 1 3 2 3 3
		//4 1 4 2 4 3
		//5 1 5 2 5 3
		
		for(int i=0; i<=5; i++)
		{
			int count=1;
            for (int j = 0; j <6; j++) 
            {
				if(true)
				{
					if(j%2==0)
						System.out.print(i+1+" ");					
					else				
						System.out.print(count+++" ");				
				}
				else
				
					System.out.print(" ");
				
			}
            System.out.println();
		}
		
	}
}
