package pattern;

public class Hw8 {

	public static void main(String[] args) {

		int num=123;
		int digit;
		int reverse=0;
		int orignalnum=num;
		
	    while(num!=0)
	    {
	    	digit=num%10;
	    	reverse=reverse*10+digit;
	    	num/=10;
	    }
	    System.out.println(reverse);
	    if(orignalnum==reverse)
	    {
	    	System.out.println("its palindrome");
	    }
	    else
	    {
	    	System.out.println("not palindrome");
	    }
	}
}
