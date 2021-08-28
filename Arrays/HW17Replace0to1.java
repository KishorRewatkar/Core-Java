package Arrays;

public class HW17Replace0to1 {

	public static void main(String[] args) {
		
		int a[]= {0,1,0,1,0,1,0,1,0,1,0,1};
		
		for (int i = 0; i < a.length; i++)
		{
			int tem=a[i];
			if(tem==0)
			{
				a[i]=1;
			}
			
		}
		for(int p:a) 
		{		
		System.out.println(p);
	    }
	}	
}