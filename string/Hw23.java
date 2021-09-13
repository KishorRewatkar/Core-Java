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
		System.out.println(s1);

		
//		int start=0;
//		int end=s.length()-1;
//		//start madhe jar 0 nasel tar break; kar start ++ kar
//		while(true)
//		{
//			if(s.charAt(start)!=' ')
//				break;
//			else 
//				start++;
//		}
//		while(true)
//		{
//			if(s.charAt(end)!=' ')
//				break;
//			else
//				end--;
//		}
//		String s1="";
//		for (int i =start; i <end; i++)
//		{
//			s1=s1+s.charAt(i);
//		}

	}
}
