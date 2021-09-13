package Test300831;

public class Qno1Contains {

	public static void main(String[] args)
	{
		String s="kishor";
		String s1="kishor";
		System.out.println(s.contains(s1));

		int i = 0;
		for (; i < s.length(); i++) 
		{
			if(s.charAt(i)==s1.charAt(0))
			{
				//j1,j2, count=0;
				int j1=i;
				int j2=0;
//				int count=0;			
				while(j2<s1.length() && j1<s.length())
				{
					j2++;
					j1++;	
				}
				if(j2==s1.length())
				{	
					System.out.println(true);
					break;
				}
			}
		}
		if(i==-1)
		{
			System.out.println(-1);
		}
	}
}
