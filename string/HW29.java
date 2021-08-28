package string;

public class HW29 {

	public static void main(String[] args) {
		
		String[] s={"kishor","aliya","harshal","sumit"};
		
		for (int i = 0; i < s.length; i++)
		{
			for (int j = 0; j < s.length; j++) 
			{
				if(i<j && s[i].compareTo(s[j])>=0)
				{
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println(s[i]);
		}
		
		
		
		
		
		for (int i = 0; i < s.length; i++)
		{
			for (int j = i+1; j < s.length; j++) 
			{
				if(i<j && s[i].length()>s[j].length())
				{
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println(s[i]);
		}
	}
}
