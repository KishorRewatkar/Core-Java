package recurtionProblem;

public class SumOFAdditon {

	public static void main(String[] args) {
		
		int a[]= {93,84,78,2,65,4};
		int i=0;
		int sum=add(a,i);
		System.out.println(sum);
	}

	private static int add(int[] a, int i) {

		if(i<a.length)
		{
			int sum=a[i]+add(a,i+1);
			return sum;
		}
		else
		return 0;
	}
}
