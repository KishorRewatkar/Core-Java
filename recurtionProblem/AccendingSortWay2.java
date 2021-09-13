package recurtionProblem;

public class AccendingSortWay2 {

	public static void main(String[] args) {
		
		int a[]= {22,10,44,50,33};
		sort(a,0,0);
		print(a,0);
		}	
	private static void sort(int[] a, int i, int j) {
		
		if(i<a.length && j<a.length)
		{
			if(i<j && a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			if(j==a.length-1)
			{
				i++;
				j=0;
			}
			else
			{
				j++;
				
			}
			sort(a,i,j);
		}
		
	}
	private static void print(int[] a, int i) {
			
			if(i<a.length)
			{
				System.out.println(a[i]+" ");
				i++;
				print(a,i);
			}
		}
}
