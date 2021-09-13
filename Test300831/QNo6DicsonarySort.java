package Test300831;

public class QNo6DicsonarySort {

	public static void main(String[] args) {
		String sa[]= {"i","an","am","going","to","collage"};
		
		for (int i = 0; i < sa.length; i++)
		{
			for (int j = 0; j < sa.length; j++)
			{
				if(i<j && sa[i].length()>sa[j].length())
				{
					String temp=sa[i];
					sa[i]=sa[j];
					sa[j]=temp;
				}
				else if(sa[i].length()<sa[j].length())
				{
					
				}
			}
			
		}
		for (int i = 0; i < sa.length; i++)
		{
			System.out.print(sa[i]+" ");
		}
	}
}
