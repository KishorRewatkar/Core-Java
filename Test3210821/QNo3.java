package Test3210821;

public class QNo3 {

	public static void main(String[] args) {
		
		int a[][]= {{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					{13,14,15,16}};
		
		
	
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++) 
			{
				if(a[i][j]==a[j][i])
				{
					System.out.println(a[i][j]+" ");
				}
			}
		}
	}
		
}

