package Arrays;

import java.util.Arrays;

public class Hw39SplitArray {


	public static void main(String[] args) {
		
		int a[]= {5,1,3,6,8,2,9,0,10};
//		int a[]= {1,2,4,0,2};
		
		int inn=0, decn=0;
		
		if(a[0]>a[1])
		{
			decn=a[0];
			inn=a[1];
		}
		else
		{
			decn=a[1];
			inn=a[0];
		}
		int incas=1;
		int decas=1;
		for (int i = 2; i < a.length; i++)
		{
			if(a[i]>inn)
			{
				inn=a[i];
				incas++;
			}
			else if(a[i]<decn)
			{
				decn=a[i];
				decas++;
			}
			else
			{
				System.out.println(-1);
				System.out.println("No sucjseq");
				System.exit(0);
			}
		}
		int[] ina=new int[incas];
		int[] deca=new int[decas];
		int incindex=0;
		int decindex=0;
		if(a[0]>a[1])
		{
			deca[decindex++]=a[0];
			ina[incindex++]=a[1];
			decn=a[0];
			inn=a[1];
		}
		else
		{
			deca[decindex++]=a[1];
			ina[incindex++]=a[0];
			decn=a[1];
			inn=a[0];
		}
		for (int i = 2; i < a.length; i++) 
		{
			if(a[i]>inn)
			{
				inn=a[i];
				ina[incindex++]=a[i];
			}
			else
				
			{
				decn=a[i];
				deca[decindex++]=a[0];
			}
		}
		
		System.out.println(Arrays.toString(ina));
		System.out.println(Arrays.toString(deca));
		
		for (int i = 0; i < ina.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < deca.length; i++) 
		{
			System.out.print(deca[i]+" ");
			
		}
	}
}
