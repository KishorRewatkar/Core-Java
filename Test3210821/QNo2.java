package Test3210821;

public class QNo2 {

	public static void main(String[] args) {
		
		int a[]= {1,2,8,6,3,2,8,2,7,3,6,2,8,7,3};
		
		int count=0;
		for (int i = 0; i < a.length; i++)
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
		System.out.println("duplicate count= "+count);
		int b[]=new int[a.length-count];
		int index=0; 
		for(int i=0; i<a.length; i++)
		{
			boolean flag=false;
			for (int j = 0; j < b.length; j++)
			{
				if(a[i]==b[j])
				{
					flag=true;
				}
			}
			if(!flag)
			{
				b[index++]=a[i];
			}
		}
		for(int i=0; i<b.length; i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}
