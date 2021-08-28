package string;

public class Hw17 {

	public static void main(String[] args) {

		String s="aaabbbccdd";
		int count=0;
		for(int i=0; i<s.length(); i++)
		{
			for(int j=i+1; j<s.length(); j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
					break;
				}			
			}
		}
		System.out.println(count+" ");
	}

}
