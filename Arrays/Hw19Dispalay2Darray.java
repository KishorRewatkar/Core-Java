package Arrays;

public class Hw19Dispalay2Darray {

	public static void main(String[] args) {
		
		int a[][]={{1,2,3,5},
					{3,7,5,6},
					{6,4,3,6},
					{5,6,8,9}};

		int b[][]={{3,22,32},
				{34,72,54},
				{64,45,35}};
		
		System.out.println(a[0][0]);
		for(int i=0; i<a.length; i++)
		{
		  for(int j=0; j<a.length; j++)
		  {
			  System.out.print(a[i][j]);
		  }
		  System.out.println();
			        
		}
		System.out.println();
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				if(j-i<=0)
				{
					System.out.print(a[i][j]);
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		 
	}
}

