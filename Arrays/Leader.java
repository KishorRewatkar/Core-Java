package Arrays;

public class Leader {

	public static void main(String[] args) {
		int a[]= {1,3,4,5,9,3,5,4,6,1,0,24,3,6,11};
	
		for(int i=0; i<a.length; i++)
		{
			int count=0;
			
			for(int j=i+1;j<a.length; j++)
			{
				if(a[j]>=a[i])
				{
					count++;
					break;

				}
			}
			if(count==0)
			{
				System.out.println(a[i]);
			}
		}
	}
}
