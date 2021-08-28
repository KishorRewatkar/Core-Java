package Arrays;

public class Cw6TransposeMatrix {

	public static void main(String[] args) {

		int a[][]= {{1,2,3},
					{4,5,6},
					{7,8,9}};
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				if(a[j][i]==a[i][j])
				{
					System.out.println(a[i][j]);
				}
			}
		}
	}

}
