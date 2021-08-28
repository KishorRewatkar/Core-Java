package Arrays;

public class Count {

	public static void main(String[] args) {
		
		int a[]= {1,1,3,3,4,4,6,6,7,7};
		int count=0;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					count++;
					break;
				}
				
			}
		}
		System.out.println(count);
		int b[]=new int[a.length-count];
		
		for(int i=0; i<a.length; i++)
		{
			boolean flag=true;
			for(int j=0; j<b.length; j++)
			{
				if(a[i]==b[j])
				{
					flag=false;
				}
			}
		}
	}
}
