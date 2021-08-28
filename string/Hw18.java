package string;

public class Hw18 {

	public static void main(String[] args) {
		
		String s="kishor rewa";
		//one way
//		char ch[]=s.toCharArray();
//		
//		for(int i=0; i<ch.length/2; i++)
//		{
//			char temp=ch[i];
//			ch[i]=ch[ch.length-1-i];
//			ch[ch.length-1-i]=temp;
//		}
//		for(char  p:ch)
//		{
//			System.out.print(p);
//		}
		//two way
		String[] sa=s.split(" ");
//		for (int i =sa.length-1; i >=0; i--) 
//		{
//			System.out.print(sa[i]+" ");
//		}
		//three way
		for (int i = 0; i < sa.length; i++) 
		{
			String s1=sa[i];
			for(int j=s1.length()-1; j>=0; j--)
			{
				System.out.print(s1.charAt(j));
			}
			System.out.print(" ");
		}
		
	}
}
