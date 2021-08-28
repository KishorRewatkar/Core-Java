package pattern;

public class p9 {

	public static void main(String[] args) {
//		    A
//		   B B
//		  C C C
//		 D D D D
//		E E E E E
//		 D D D D
//		  C C C
//		   B B
//		    A
		int count=0;
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(i+j>=4 && j-i>=-4)
				{
					System.out.print((char)(count+65)+" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			if(i<4)
				count++;
			else
				count--;
			System.out.println();
		}
	}
}
