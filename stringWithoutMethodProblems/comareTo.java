package stringWithoutMethodProblems;

public class comareTo {

	public static void main(String[] args) {
		
		String s="slaj";
		String s1="dljjjhj";
		
      	System.out.println(s.compareTo(s1));
		
		int num=0;
		
		if(s.length()<s1.length())
			num=s.length();
		else
			num=s1.length();
		int i=0;
		while(num>0)
		{
			if(s.charAt(i)!=s1.charAt(i))
			{
				System.out.println(s.charAt(i)-s1.charAt(i));
				break;
			}
			i++;
			num--;
		}
		if(num==0)
		{
			System.out.println(s.length()-s1.length());
		}
	}
}
