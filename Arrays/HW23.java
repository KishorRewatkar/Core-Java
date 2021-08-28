package Arrays;

public class HW23 {

	public static void main(String[] args) {
		
//sum of inner element
		
		int a[][]={{1,2,3,5},
					{3,7,5,6},
					{6,4,3,7},
					{4,6,8,9}};
			
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				if(i==0 || j==0 || i==3 || j==3)
				{
					System.out.print(a[i][j]+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

//		for(int i=0; i<a.length; i++)
//		{
//			for(int j=0; j<a.length; j++)
//			{
//				if(i==0 || i==3 ||j==0 || j==3)
//				{
//					System.out.print(a[i][j]);
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
//		
		
		
		
//		for(int i=0; i<a.length; i++)
//		{
//			for(int j=0; j<a.length; j++)
//			{
//				if(i!=0 && i!=3 && j!=0 && j!=3)
//				{
//					System.out.print(a[i][j]);
//					sum=sum+a[i][j];
//				}
//				
//			}
//			System.out.println(" ");
//		}
//		System.out.println("sum of inner element "+sum);
//		
	
		  //Way two 
//		for(int i=0; i<a.length; i++)
//		{
//			for(int j=0; j<a.length; j++)
//			{
//				if((i==0 || i==3) && (j==0 || j==3))
//				{
//					System.out.print(a[i][j]);
//					sum=sum+a[i][j];
//				}
//				
//			}
//			System.out.println(" ");
//		}
//		System.out.println("sum of inner element "+sum);
//		
//		
		
	} 
}
