package Arrays;

public class ShiftingElementSort {

	public static void main(String[] args) {
		
		int a[]= {2,4,1,6,3,8,9,5,7};
		
		for(int i=1; i<a.length; i++ )
		{
			int temp=a[i];
			for(int j=i-1; j>=0; j--)
			{
				if(a[j]>temp)
				{
					a[j+1]=a[j];
				}
				else
				{
					a[j+1]=temp;
					break;
				}
				if(j==0)
				{
					a[0]=temp;
				}
			}
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
