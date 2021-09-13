package recurtionProblem;

public class compareTwoString {

	public static void main(String[] args) {
		
		String s1="abcd";
		String s2="abcdfssa";
		boolean areTheySame=compare(s1,s2,0);
		if(areTheySame=true)	
			System.out.println(s1.length()-s2.length());
	}

	private static boolean compare(String s1, String s2, int i) {

		if(i<s1.length() && i<s2.length())
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
			 System.out.println(s1.charAt(i)-s2.charAt(i));
			 return false;
			}
			else
				return compare(s1,s2,i+1);
		}
		else
			return true;
	}
}
