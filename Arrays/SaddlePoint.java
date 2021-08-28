package Arrays;

public class SaddlePoint {

	public static void main(String[] args) {
		
		int a[][]= {{6,3,1},
				     {9,7,8},
				     {2,4,5}};
		
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				boolean smallest=true;
				for(int k=0; k<3; k++)
				{
					if(a[i][k]<a[i][k])
					{
						smallest=false;
					}
					
				}
				boolean largest=true;
				for(int k=0; k<3; k++)
				{
					if(a[i][k]<a[k][j])
					largest=false;
				}
				if(smallest==largest)
				{
					System.out.println(a[i][j]);
				}
			}
			
		}
		
		}
	}

