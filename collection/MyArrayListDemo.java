package collection;

class NewArrayList{
	
	int a[]=new int[5];
	int index=0;
	public void add(int num)
	{
		if(index>=a.length)
		{
			//why we take 2* a.length size
			int b[]=new int[2*a.length];
			for(int i=0; i<a.length; i++)
			{
				b[i]=a[i];
			}
			//now a is pointing to B as refferance array
			a=b;
		}
		a[index++]=num;	
	}
	
	public void print()
	{
		for(int i=0; i<index; i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}
public class MyArrayListDemo {

	public static void main(String[] args) {
		NewArrayList list=new NewArrayList();
		list.add(20);
		list.add(39);
		list.add(20);
		list.add(39);
		list.add(20);
		list.add(39);
		list.add(48);
		list.add(20);
		list.add(39);
		list.print();
		
	}
}
