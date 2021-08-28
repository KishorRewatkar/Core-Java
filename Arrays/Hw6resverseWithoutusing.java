package Arrays;

public class Hw6resverseWithoutusing {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int j=a.length-1;	
		
		for(int i=0; i<a.length/2; i++)
		{					
			a[i]=a[i]+a[j];
			a[j]=a[i]-a[j];
			a[i]=a[i]-a[j];
			j--;
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
	}
}
