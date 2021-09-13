package Test300831;

public class Q2 {

	public static void main(String[] args) {
		
		String s="Hello Im  kishor";
		char ca2[]=new char[s.length()];
		
		for (int i = 0; i < s.length(); i++)
		{
			ca2[i]=s.charAt(i);
		}
		for (int i = 0; i < ca2.length/2; i++) 
		{
			char temp=ca2[i];
			ca2[i]=ca2[ca2.length-1-i];
			ca2[ca2.length-1-i]=temp;
		}
		for(int i=0; i<ca2.length; i++)
		{
			System.out.print(ca2[i]);
		}
		
//		String[] s1=s.split(" ");
//		for(int i=0; i<s.length(); i++)
//		{
//			String s2=s1[i];
//			for(int j=s2.length()-1; j>=0; j--)
//			{
//				System.out.println(s2.charAt(i));
//			}
//		}
	}
}
