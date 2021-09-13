package collectionMyLinkedListHash;
class LinkeHasetable{

	Node[]a=new Node[5];
	Node linkedListRoot;
	public String get(int key)
	{
		Node temp=a[key%a.length];
		while(temp!=null)
		{
			if(temp.key==key)
				return temp.value;
			temp=temp.hashTableNext;
		}
		return "not found";
		
	}
	
	public void print()
	{
		Node temp=linkedListRoot;
		while(temp!=null)
		{
			System.out.println(temp.key+" "+temp.value);
			temp=temp.linkeListNext;
		}
	}
	
	public void add(int key, String value)
	{
		int index=key%a.length;
		if(a[index]==null)
		{
			a[index]=new Node(key,value);
			addinLinkedList(a[index]);
		}
		else
		{
			Node temp=a[index];
			while(true)
			{
				if(temp.key==key)
				{
					temp.value=value;
					break;
				}
				else if(temp.hashTableNext==null)
				{
					temp.hashTableNext=new Node(key,value);
					addinLinkedList(temp.hashTableNext);
					break;
				}
				temp=temp.hashTableNext;
			}
			
		}
	}

	private void addinLinkedList(Node node)
	{
	 if(linkedListRoot==null)
		 linkedListRoot=node;
	 else
	 {
		 Node temp=linkedListRoot;
		 while(temp.linkeListNext!=null)
		 {
			 temp=temp.linkeListNext;
		 }
		 temp.linkeListNext=node;
	 }
	 
	}
}

class Node{
	
	int key;
	String value;
	Node hashTableNext;
	Node linkeListNext;
	Node(int key,String value)
	{
		this.key=key;
		this.value=value;
	}
}

public class LinkedListHashMap {

	public static void main(String[] args) {
		
		LinkeHasetable list=new LinkeHasetable();
		list.add(91, "nineone");
		list.add(74, "sevenfour");
		list.add(33, "threeThree");
		list.add(39, "ThreeNine");
		list.add(54, "fiveFour");
		list.add(60, "sixty");
		list.add(53, "fiveThree");
		list.add(32, "threetwo");
		list.add(76, "sevenSix");
		list.add(2, "two");
		list.add(28, "twoEight");
		list.add(11, "eleven");
		list.print();
	}
}
