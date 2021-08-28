package Arrays;
import java.io.*;
public class Cw5PoistiveNegativeInt {

	    public static void main(String args[])
	    {
	        int a[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
	        
	       int temp; int j=0;
	       for(int i=0; i<a.length; i++)
	       {
	    	   if(a[i]<0)
	    	   {
	    		   if(i!=j)
	    		   {
	    			   temp=a[i];
	    			   a[i]=a[j];
	    			   a[j]=temp;
	    		   }
	    		   j++;
	    	   }   	   
	       }
	       for(int p:a)
	       {
	    	   System.out.print(p+" ");
	       }
	    }
	}
