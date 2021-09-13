package string;

public class Hw24 {

	public static void main(String[] args) {
		//fequancy  of charchters
		String s="abcdeabcab";
		char a1[]=s.toCharArray();
		
		//duplicate remove karche ahe and uniq lent ghyvch ahe
		int count=0;
		for (int i = 0; i < a1.length; i++)
		{
			for (int j = i+1; j < a1.length; j++)
			{
				if(a1[i]==a1[j])
				{
					count++;
					break;
				}
			}
		}
		char a2[]=new char[a1.length-count];
		int index=0;
		int a3[]=new int [a2.length];
		for (int i = 0; i < a1.length; i++) 
		{
			boolean flag=false;
			for (int j = 0; j < a2.length; j++) 
			{
				if(a1[i]==a2[j])
				{
					flag=true;
				}
			}
			if(!flag)
			{
				a2[index++]=a1[i];
			}
		}
	//cheak point	
		for (int i = 0; i < a2.length; i++) 
		{
			int counter=0;
			for (int j = 0; j < a1.length; j++) 
			{
				if(a1[j]==a2[i])
					counter++;
			}
			a3[i]=counter;
		}
		//sorting 
		for (int i = 0; i < a3.length; i++) 
		{
			for (int j = 0; j < a3.length; j++)
			{
				if(i<j && a3[i]>a3[j])
				{
					
					//int swap a3	
					int temp2=a3[i];
					a3[i]=a3[j];
					a3[j]=temp2;
					
					//char swap a2
					char temp=a2[i];
					a2[i]=a2[j];
					a2[j]=temp;
					
				}
			}
		}
		for (int i = 0; i < a3.length; i++) 
		{
			System.out.println(a2[i]+" "+a3[i]);
		}
		System.out.println("max "+a2[a2.length-1]+" "+a3[a3.length-1]);
		System.out.println("min "+a2[0]+ " "+a3[0]);
		
	}
}
