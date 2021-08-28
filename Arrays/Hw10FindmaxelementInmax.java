package Arrays;

public class Hw10FindmaxelementInmax {

	public static void main(String[] args) {
		
		int arr[][]= {{1,2,3},
						{3,45,5},
						{4,5,6}};
		
		int max=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if(arr[i][j]>max)
				{
					max=arr[i][j];
				}
			}
		}
		System.out.println("maximum value in the given matrix="+max);
		

		
	}
}
