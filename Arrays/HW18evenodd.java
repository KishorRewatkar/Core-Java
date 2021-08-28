package Arrays;

public class HW18evenodd {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7,8,9,10,92,374,92,39,4};
		int even[]=new int[a.length];
		int odd[]=new int[a.length];
		
		System.out.println("even");

		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				even[i]=a[i];
				System.out.print(even[i]+" ");
			}
		}
		System.out.println();
		System.out.println("odd");

		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==1)
			{
				odd[i]=a[i];
				System.out.print(odd[i]+" ");
			}
		}

	}
}
