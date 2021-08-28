package Test3210821;

public class QNo1 {

	public static void main(String[] args) {
		
		int a[]= {7,3,2,5,6,32,62};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(i<j && a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
							
				}
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]+" ");
		}
		System.out.println("second largest is="+a[a.length-2]);
		
	}
}
