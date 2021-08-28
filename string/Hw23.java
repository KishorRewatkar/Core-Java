package string;

public class Hw23 {

	public static void main(String[] args) {
		
		String s="  hello      how are   you   ";
	
		s=s.trim();
		String s1="";
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)==' ')
			{
				
			}
			else
			{
				s1=s1+s.charAt(i);
			}
			System.err.println(s1);
		}
	}
}
