package Arrays;

public class Hw20Avargeofinnerelement {

	public static void main(String[] args) {

		int a[][]={{1,2,3},
				{3,7,5},
				{6,4,3}};
		int sum=0;
		
//		for(int i=0; i<a.length; i++)
//		{
//		  for(int j=0; j<a.length; j++)
//		  {
//			 sum=sum+a[i][j];
//			 
//		  }
//		  System.out.println();
//			        
//		}
//		System.out.println("Avrage of sum="+sum/a.length);
//		
		
		//sum of outer elemet
		for(int i=0; i<a.length; i++)
		{
		  for(int j=0; j<a.length; j++)
		  {
			  if(i==0 || j==2 || j==0 || j==2)
			 sum=sum+a[i][j];
			 
		  }
		  System.out.println();
			        
		}
		System.out.println("sum of outer element="+sum);
	}
}
