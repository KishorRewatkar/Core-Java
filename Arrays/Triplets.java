package Arrays;

public class Triplets {

	public static void main(String[] args) {
		
	  int []a= {5,1,3,4,7};
	  
	  for(int i=0; i<a.length; i++)
	  {
		  for(int j=i+1; j<a.length; j++)
		  {
			  int temp=a[i];
			  a[i]=a[j];
			  a[j]=temp;
		  }
	  }
	  for (int i = 0; i < a.length; i++)
	  {
		for (int j = i+1; j < a.length; j++) 
		{
			for (int j2 = j+1; j2 < a.length; j2++)
			{
			  if(a[i]+a[j]+a[j2]<12)
			  {
				  System.out.println(a[i]+" "+a[j]+" "+a[j2]);
			  }
			}
		}
	}
	}
	
}
