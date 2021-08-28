package Arrays;

class Ques{
	
	int []a=new int[5];
	int index=0;
	
	public void set(int num)
	{
		if(index>=a.length)
		{
			int []b=new int[2*a.length];
			for(int i=0; i<a.length; i++)
			{
				b[i]=a[i];
			}
			a=b;
		}
		a[index++]=num;
		
	}
	public int get()
	{
		int num=a[0];
		for (int i = 0; i < a.length-1; i++) 
		{
			a[i]=a[i+1];
			
		}
		index--;
		return num;
	}
}
public class QuesStack{

	public static void main(String[] args) {

		Ques q=new Ques();
		q.set(10);
		q.set(12);
		q.set(14);
		q.set(16);
		q.set(18);
		System.out.println(q.get());
		System.out.println(q.get());
		System.out.println(q.get());
		System.out.println(q.get());
		System.out.println(q.get());
		System.out.println(q.get());


		
		
	}

}
