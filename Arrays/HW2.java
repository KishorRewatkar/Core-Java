package Arrays;

public class HW2 {

	public static void main(String[] args) {
		

		int a[]= {1,2,3,4,36,6,7,8,9};
		int p=36;
		
		boolean counter=true; 
		int counter2=0;
		for(int i=0; i<=a.length-1; i++)
		{
			if(a[i]==p)
			{
				counter=false;
				counter2++;
			}
		}
		if(counter2==0)
		{
			System.out.println("Not found");
		}
		else
		{
			System.out.println("Found");
		}
	}
}
