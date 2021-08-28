package stringWithoutMethodProblems;

public class startwithWithoutMethod {

	public static void main(String[] args) {
		
		String s="abcdaldjlsda";
		String s1="abcd";
		int i=0;
		int j=0;
		int count=0;
		
		System.out.println(s.startsWith(s1));
		
		while(i<s.length() && j<s1.length())
		{
			if(s.charAt(i)==s1.charAt(j))
				count++;
			i++;
			j++;
		}
		if(count==s1.length())
		{
			System.out.println(true);
		}
		else
			System.out.println(false);

	}
}
