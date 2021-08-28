package stringWithoutMethodProblems;

public class TrimWithoutSpaces {

	public static void main(String[] args) {
		
		String s="   Kishor    ";
		int start=0;
		int end=s.length()-1;
		while(true)
		{
			if(s.charAt(start)!=' ')
				break;
			else
			   start++;
		}
		while(true)
		{
			if(s.charAt(end)!=' ')
				break;
			else
				end--;
		}
		String s1="";
		for (int i = start; i<=end; i++) 
		{
		 s1=s1+s.charAt(i);	
		}
		System.out.println(s1);
	}
}
