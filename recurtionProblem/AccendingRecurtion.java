package recurtionProblem;

public class AccendingRecurtion {

	public static void main(String[] args) {
		
		int []a= {55,33,44,22,11};
		sorti(a,0);
		print(a,0);
	}

	private static void sorti(int[] a, int i) {

		if(i<a.length)
		{
			sortj(a,i,i+1);
			i++;
			sorti(a,i);
		}
	}

	private static void sortj(int[] a, int i, int j) {

		if(j<a.length)
		{
			if(i<j && a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			j++;
			sortj(a,i,j);
		}
	}

	private static void print(int[] a, int i) {
		
		if(i<a.length)
		{
			System.out.print(a[i]+" ");
			i++;
			print(a,i);
		}
	}
}
