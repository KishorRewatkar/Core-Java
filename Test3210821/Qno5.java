package Test3210821;

public class Qno5 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8};
		
		int temp=a[0];
		
		for (int i = 0; i < a.length-1; i++) 
		{
			a[i]=a[i+1];
		}
		a[7]=temp;
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}
}
