package collection;

class Node2{
	
	int num;
	Node next;
	Node prev;
	
	Node2(int num)
	{
		this.num=num;
	}
}
class MyDLinlList{
	
	Node head;
	Node tail;
	
	public void insert(int index, int num)
	{
		if(index==0)
		{
			//for the index of 0
			Node newObj=new Node(num);
			newObj.next=head;
			head.prev=newObj;
			head=newObj;
		}
		else
		{
			int count=0;
			Node temp=head;
			boolean needToAdd=true;
			while(count<=index-1)
			{
				if(temp.next!=null)
				{
					temp=temp.next;
				}
				else
				{
					break;
					
				}
				count++;
			}
			if(needToAdd==true)
			{
				//for the index of last 
				Node newObj=new Node(num);
				newObj.prev=temp.prev;
				newObj.next=temp;
				newObj.prev.next=newObj;
				temp.prev=newObj;
			}
		}
	}
	
	public void add(int num)
	{
		if(head==null)
		{
			head=new Node(num);
			tail=head;
		}
		else
		{
			Node newObj=new Node(num);
			newObj.prev=tail;
			tail.next=newObj;
			tail=newObj;
		}
	}
	//print using to string method
	public String toString()
	{
		String s="[";
		Node temp=head;
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
	//printing using normal print
	public void print()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.num);
			temp=temp.next;
		}
	}
	//printReverse 
	public void printRev()
	{
		Node temp=tail;
		while(temp!=null)
		{
			System.out.println(temp.num);
			temp=temp.prev;
		}
	}
}

public class DoubliLinkList {

	public static void main(String[] args) {
		
		MyDLinlList list=new MyDLinlList();
		list.add(10);
		list.add(40);
		list.add(50);
		list.add(60);
		list.insert(1, 20);
		list.insert(2, 30);
		list.insert(0, 0);	
		
		System.out.println(list);
//      list.print();
//		list.printRev();
	}
	
}
