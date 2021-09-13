package pattern;

public class Cw1 {

	public static void main(String[] args) {
		
//		int n1=0, n2=1, n3, count=7;
//		System.out.println(" 0");
//
//		for(int i=0; i<=count; i++)
//		{
//			n3=n1+n2;
//			System.out.println(" "+n3);
//			n1=n2;
//			n2=n3;
//
//		}
		 int n=10, n1=0, n2=1;
		 System.out.println("fibonacci seris till"+n+"tems");
		  for(int i=1; i<=n; ++i)
		   {
		     System.out.println(n1+" ");
		          int temp=n1+n2;
		                   n1=n2;
		                   n2=temp;
	}
}
}
