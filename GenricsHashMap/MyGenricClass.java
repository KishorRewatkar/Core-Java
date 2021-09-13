package GenricsHashMap;
class HeshineHashMap<DT1,DT2>{
	
	Node<DT1,DT2>[] a=new Node[5];
	
	public void print()
	{
		for(int i=0; i<a.length; i++)
		{
			Node<DT1,DT2> temp=a[i];
			while(temp!=null)
			{
				System.out.println(temp.key+" "+temp.value);
				temp=temp.next;
			}
		}
	}
	public void add(DT1 key,DT2 value)
	{
		int index=key.hashCode()%a.length;
		if(a[index]==null)
			a[index]=new Node<DT1,DT2>(key,value);
		else
		{
			Node<DT1,DT2> temp=a[index];
			while(true)
			{
				if(temp.key==key)
				{
					temp.value=value;
					break;
				}
				else if(temp.next==null)
				{
					temp.next=new Node<DT1,DT2>(key,value);
					break;
				}
				temp=temp.next;
			}
		}
	}
}
class Node <DT1, DT2>
{
	DT1 key;
	DT2 value;
	Node<DT1, DT2> next;
	
	public Node(DT1 key, DT2 value) {
	
		this.key = key;
		this.value = value;
	
	}

}
public class MyGenricClass {

	public static void main(String[] args) {
		HeshineHashMap<Integer,String> map=new HeshineHashMap<>();
		map.add(1, "one");
		map.add(2, "two");
		map.add(3, "three");
		map.add(4, "four");
		map.add(5, "five");
		map.add(6, "six");
		map.add(7, "seven");
		map.add(8, "eight");
		
//		map.add("one", 1);
//		map.add("two", 2);
//		map.add("three",3 );
//		map.add("four", 4 );
//		map.add("five", 5);
		map.print();
		
	}
}
