package Test3210821;

public class QNo7 {

	public static void main(String[] args) {
		
		int a[]= {1,1,1,1,1,2,2,3,4};
		int n[]= {1,2,4};
		
		for(int j=0; j<n.length; j++)
		{
			int pcount=n[j];
			int count=0;
			for (int i = 0; i < a.length; i++)
			{
				if(a[i]==pcount)
				{
					count++;
				}
			}
			int b[]=new int[a.length-count];
			int index=0;
			for (int i = 0; i < a.length; i++) 
			{
				if(a[i]!=pcount)
				{
					b[index++]=a[i];
				}
			}
			a=b;
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.println("uniq is="+a[i]);
		}
	}
}
