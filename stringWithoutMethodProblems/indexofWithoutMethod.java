package stringWithoutMethodProblems;

public class indexofWithoutMethod {

	public static void main(String[] args) {
		
		String s1="abcdaabbccaadfdfag";
		String s2="aab";
		
		int check=0;
		int index=0;
		
		for (int i = 0; i < s1.length(); i++)
		{
			check=0;
			for (int j = 0, k=i; j <s2.length(); j++,k++) 
			{
				if(s1.charAt(k)==s2.charAt(j))
				{
					check++;
					index=i;
				}
			}
			if(check==s2.length())
			{
				System.out.println("found at location "+index);
				break;
			}
		}
		if(check!=s2.length())
		{
			System.out.println(-1);
		}
	}
}
