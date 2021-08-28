package Test3210821;

public class QNo4 {

	public static void main(String[] args) {
		
		int a[][]= {{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					{13,14,15,16}};
		int sum=0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++) 
			{
				if((i!=0 && j!=0) && (i!=3 && j!=3))
				{
					sum=sum+a[i][j];
					if(a[i][j]%2==0)
					{
						System.out.println("even of inner element= "+a[i][j]);
					}				
				}			
			}
		}
		System.out.println("avrage of inner element= "+sum/a.length);
		
		
	}
}
