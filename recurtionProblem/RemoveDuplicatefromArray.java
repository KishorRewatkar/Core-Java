package recurtionProblem;

public class RemoveDuplicatefromArray {

	static int []a= {1,1,1,1,1,2,2,2,3,3,4,5};
	
	public static void main(String[] args) {
		
		int n[]= {1,2,3,4};
		loopi(n,0);
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

	private static void loopi(int[] n, int i) {

		if(i<n.length)
		{
			int count=findcount(0,n[i],0);
			int[]b=new int[a.length-count];
			addinB(0,b,0,n[i],count);
			a=b;
			i++;
			loopi(n,i);
		}
	}

	private static int findcount(int j, int num, int count) 
	{
		if(j<a.length)
		{
			if(a[j]==num)
				count++;
			if(count==2)
				return count;
			else
				return findcount(j+1,num,count);
			
		}
		return count;
	}

	private static void addinB(int j, int[] b, int index, int num, int count)
	{
		if(j<a.length)
		{
			if(a[j]==num && count>0)
			{
				count--;
			}
			else
				b[index++]=a[j];
			j++;
			addinB(j,b,index,num,count);
		}
		
	}
}
