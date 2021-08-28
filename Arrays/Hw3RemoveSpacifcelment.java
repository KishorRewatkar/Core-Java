package Arrays;

public class Hw3RemoveSpacifcelment {

	public static void main(String[] args) {
		
     int []a= {1,2,3,4,5,6,7};
     
     int remove=4; 
     int present = 0;
     
     for(int i=0; i<a.length; i++)
     {
    	 if(a[i]==remove)
    	 {
    		 present=i;
    	 }
     }
     for(int i=present; i<a.length-1; i++)
     {
    	 a[i]=a[i+1];
     }
     
    for(int i=0; i<a.length-1; i++)
    {
    	System.out.println(a[i]+" ");
    }
     
     
     
     
     
     
     
     
     
     
     
//     int remove=9;
//     int counter=0;
//     
//     for(int i=0; i<a.length-1; i++)
//     {
//    	 if(a[i]==remove)
//    	 {
//    		 counter++;
//    	 }
//    	 if(counter==1)
//    	 {
//    		 a[i]=a[i+1];
//    	 }
//     }
//     if(counter==1 || a.length==remove)
//     {
//    	 for(int i=0; i<a.length-1; i++)
//    	 {
//    		 System.out.println(a[i]);
//    	 }
//     }
//     else
//     {
//    	 System.out.println("not found");
//     }
//        
     
//       int remove=5;
//       
//       boolean found=false;
//       
//       for(int i=0; i<a.length-1; i++)
//       {
//    	   if(a[i]==remove)
//    	   {
//    		   found=true;
//    	   }
//    	   if(found==true)
//    	   {
//    		   a[i]=a[i+1];
//    	   }
//       }
//       if(found==true || a[6] ==remove)
//       {
//    	   for(int i=0; i<a.length-1; i++)
//    	   {
//    		   System.out.println(a[i]);
//    	   }
//       }
//       else
//       {
//    	   System.out.println("not found");
//       }
//     
//     
     
     
     
		
//		int b=5;
//		
//		boolean found=false;
//		
//		for(int i=0; i<6; i++)
//		{
//			if (a[i]==b)
//			{
//				found=true;
//			}
//			if(found==true)
//			{
//				a[i]=a[i+1];
//				
//			}
//		}
//		
//		if(found==true || a[6]==b)
//		{
//
//			for(int i=0; i<6; i++)
//			{
//				System.out.print(a[i]);
//			}
//			
//		}
//		else
//			System.out.println("not found");
	}
}
