package Test2;

public class Qno_5 {

	public static void main(String[] args) {
		
		int a[]= {2,1,4,7,6,10,0};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
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
