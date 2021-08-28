package stringWithoutMethodProblems;

public class endsWith {

	public static void main(String[] args) {
		
		String s="abcdaldjlsda";
		String s1="sda";
		
		int i=s.length()-1;
		int j=s1.length()-1;
		int count=0;
		System.out.println(s.endsWith(s1));
		
		while(i>=0 && j>=0)
		{
			if(s.charAt(i)==s1.charAt(j))
			
				count++;
				i--;
				j--;
		 
		}
		if(count==s1.length())
		{
			System.out.println(true);
		}
		else
		
			System.out.println(false);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int i=s.length()-1;
//		int j=s1.length()-1;
//		int count=0;
//		
//		System.out.println(s.endsWith(s1));
//		
//		while(i>=0 && j>=0)
//		{
//			if(s.charAt(i)==s1.charAt(j))
//				count++;
//				i--;
//				j--;
//		}
//		if(count==s1.length())
//		{
//			System.out.println(true);
//		}
//		else
//			System.out.println(false);
	}
}
