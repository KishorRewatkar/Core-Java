package Arrays;

public class EvenOddInarraylooop {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9,10,11,12};
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				if(j<i && a[j]%2==0 && a[i]%2!=0)
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int p:a)
		{
			System.out.print(p+" ");
		}

	}
}
