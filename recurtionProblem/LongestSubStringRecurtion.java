package recurtionProblem;

public class LongestSubStringRecurtion {

	static int max=Integer.MIN_VALUE;
	static int start=0;
	public static void main(String[] args) {
		
		String s="kkiiiishshsh";
		loopi(s,0);
		System.out.println(max);
		for (int i = start; i <start+max; i++)
		{
			System.out.print(s.charAt(i));
		}
	}
	//i loop
	private static void loopi(String s, int i) {

		if(i<s.length())
		{	
			loopj(s,i,i+1);
			i++;
			loopi(s,i);
		}
	}	
	//j loop 
	private static void loopj(String s, int i, int j) {

		if(j<s.length())
		{
			int count=findcount(s,j,i,0);
			if(count>0)
			{
				if(j-i>max)
				{
					max=j-i;
					start=i;
				}
			}
			else if(j==s.length()-1)
			{
				if(j-i+1>max)
				{
					max=j-i+1;
					start=i;
				}
			}
			else
			{
				j++;
				loopj(s,i,j);
			}
		}
	}
	//k loop
	private static int findcount(String s, int j, int k, int count) 
	{
		if(k<j)
		{
			if(s.charAt(k)==s.charAt(j))
			{
				count++;
				return count;
			}
			else
				return findcount(s,j,k+1,count);
		}
		else
		return count;
	}
}
