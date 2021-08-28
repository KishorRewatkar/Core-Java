package Arrays;

public class Hw7BubbleSort {

	public static void main(String[] args) {
		
		int a[]= {37,8,6,23,87,72,63};
		
		for(int j=0; j<a.length; j++)
		{
			for(int i=0; i<a.length-1; i++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int p:a)
		{
			System.out.println(p);
		}
	}
}
