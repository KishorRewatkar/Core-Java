package Test2;

public class QNo4 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
		}
		for(int p:a)
		{
			System.out.println(p);
		}
	}
}
