package Arrays;

public class Hw1findindex {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,36,6,7,8,9};
		int p=36;
		
		for(int i=0; i<=a.length-1; i++)
		{
			if(a[i]==p)
			{
				System.out.println(i);
			}
		}
	}
}
