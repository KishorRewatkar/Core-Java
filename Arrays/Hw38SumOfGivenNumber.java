package Arrays;

public class Hw38SumOfGivenNumber {

	public static void main(String[] args) {
		
		int []a= {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
		
		
		for(int i=0; i<a.length; i++)
		{
			
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]+a[j]==7)
				{
					int cnt=0;
					for (int k = 0; k <=i; k++) 
					{
						if(a[j]==a[k])
						{
							cnt++;
							break;
						}
						
					}
					if(cnt==0)
					{
						System.out.println(a[i]+" "+a[j]);
					}
					
				}
				
					
			}
		}
		
		
	}
}
