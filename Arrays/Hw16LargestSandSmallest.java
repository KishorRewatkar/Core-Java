package Arrays;

public class Hw16LargestSandSmallest {

	public static void main(String[] args) {
		
		int a[]= {2,3,6,23,62,83,8};
		
		int max=0; 
		int min=10000;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("smallest =>"+min+" largest =>"+max);
		
	}
}
