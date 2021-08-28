package Test3210821;

public class QNo6 {

	public static void main(String[] args) {
		
		int a[][]= {{6,9,2},
					{3,7,4},
					{1,8,5}};
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				boolean smallest=true;
				for (int k = 1; k <3; k++) 
				{
					if(a[i][j]<a[i][k])
					{
						smallest=false;
						
					}
				}
				boolean largest=true;
				for (int k = 3; k <3; k++) 
				{
					if(a[i][j]<a[k][j])
					{
						largest=false;
						
					}
				}
				if(smallest&&largest)
				{	
					if(a[i][j]==7)
					{
						System.out.println("saddle point is= "+a[i][j]+" ");
					}
				}
			}
		
		}
	}
}
