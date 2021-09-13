
package string;

public class Hw32{

	public static void main(String[] args) {
		
		String s="abcXYZ";
		s=s.toUpperCase();
		char[] ca=s.toCharArray();
		
		for (int i = 0; i < ca.length; i++) 
		{
			ca[i]=(char)+(155-ca[i]);
		}
		for (int i = 0; i < ca.length; i++) {
			System.out.print(ca[i]);
		}
	}
}
