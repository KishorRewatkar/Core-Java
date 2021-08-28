package Arrays;

public class Hw8 {

	public static void main(String[] args) {
		int a[]= {23,45,67,89,27,75,76};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				if(i<j && a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[a.length-2]);
		
		
	}
}
