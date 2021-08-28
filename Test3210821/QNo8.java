package Test3210821;

public class QNo8 {

	public static void main(String[] args) {
		
		int a[]= {1,5,-4,-2,5-1};
		
		int sum=5;
		for (int i = 0+1; i < a.length; i++) 
		{
			for(int j=i+1; j<a.length; j++)
			{
				for(int k=j+1; k<a.length; k++)
				{
					if(a[i]+a[j]+a[k]<sum)
					{
						sum=sum+a[i]+a[j]+a[k];
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
					}
				}
			}

		}
		System.out.println("sum of element="+sum);

	}
}
