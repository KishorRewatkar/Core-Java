package Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9,10};
		
		int []c=new int[a.length+b.length];
		int aindex=0;
		int bindex=0;
		
		for (int i = 0; i < c.length; i++) 
		{
			if(i<a.length)
			{
				c[i]=a[aindex++];
			}
			else
			{
				c[i]=b[bindex++];
			}
		}
		for (int i = 0; i < c.length; i++) {
			
			System.out.println(c[i]+" ");
		}
	}
}
