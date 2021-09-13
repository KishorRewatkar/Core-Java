package Test300831;

public class Q4 {

	public static void main(String[] args) {
		
		String s="     kishor rewatkar  ";
		
		int start=0;
		int end=s.length()-1;
		String s1="";
		String s2="";
		
		if(s.charAt(6)!=' ')
		{
			while(true)
			{
				if(s.charAt(start)!=' ')
				    break;
				else
					start++;
			}
			while(true)
			{
				if(s.charAt(end)!=' ')
			        break;
				else	
					end--;		
			}
			for(int i=start; i<=end; i++)
			{
				s2=s2+s.charAt(i);
			}
			System.out.println(s2);
		}
		
		
//		for (int i = 0; i < s.length(); i++) 
//		{
//			if(s.charAt(i)==' ' && s.charAt(i+1)==' ')
//			{
//				
//			}
//			else
//			{
//				s1=s1+s.charAt(i);
//			}
//			System.out.println(s1);
//		}
//		System.err.println(s1);
//	
		
		
			
	}
}
		
		


		
		
		
		
		
		
		
		
		
		
		
		
//		 String s="hello how are you.";
//			
//	       int SpaceCount=0;
//	       
//	       for (int i = 0; i < s.length(); i++) 
//	       {
//			if(s.charAt(i)==' ')
//			{
//				SpaceCount++;
//			}
//	 	   }
//	       String sa[]=new String[SpaceCount+1];
//	       String s1="";
//	       int index=0;
//	       int count=0;
//	       for (int i = 0; i < s.length(); i++) 
//	       {
//			if(s.charAt(i)!=' ')
//				s1=s1+s.charAt(i);
//			else
//			{
//				sa[index++]=s1;
//			    s1="";
//			}
//			 if(i==s.length()-1)
//			 {
//				 sa[index++]=s1;
//			 }
//		   }
//	       
//	       for (int i = 0; i < sa.length; i++)
//	       {
//			System.out.println(sa[i]);
//		}
	

