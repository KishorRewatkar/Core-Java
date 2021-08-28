package Test2;

public class QNo2 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
		int remove=3;
		int present = 0;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==remove)
			{
				present=i;
			}
		}
		for(int i=present; i<a.length-1; i++)
		{
			a[i]=a[i+1];
		}
		for(int i=0; i<a.length-1; i++)
		{
			System.out.println(a[i]);
		}
	}
}
