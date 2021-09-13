package collection;
class Node{
	
	int num;
	Node next;
    Node prev;
	
	Node(int num)
	{
		this.num=num;
	}
}
  class MylinkList{
	  
	Node root;
	
	
	public void add(int num)
	{
		if(root==null)
			//root 
			root=new Node(num);
		else
		{
			//temp.next its cheak next node of object
			//not null then next(node)itreate till the end of the node
			//if it found null make new object of node and save
			//it on the temp 
			Node temp=root;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			//save the node ito temp variable
			temp.next=new Node(num);
		}
	}
	
	public String toString()
	{
		String s="[";
		Node temp=root;
		while(temp!=null)
		{
			s=s+temp.num;
			if(temp.next!=null)
			   s=s+", ";
			temp=temp.next;			
		}
		s=s+']';
		return s;
	}
	//print ke jagh par to string say string print kiye
//	public void print()
//	{
//		Node temp=root;
//		while(temp!=null)
//		{
//			temp=temp.next;
//		}
//	}
}
public class MyClassLinkList {

	public static void main(String[] args) {
		
		MylinkList list=new MylinkList();
		list.add(13);
		list.add(84);
		list.add(53);
		list.add(38);
		list.add(33);
		list.add(64);
//		list.print();
		System.out.println(list);
		
		
	}
}
