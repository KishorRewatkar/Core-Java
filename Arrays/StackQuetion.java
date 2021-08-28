package Arrays;
import java.util.Scanner;
class MyStack{
	
	int [] a=new int[5];
	int index=0;
	
	
	public void push(int num)
	{
		
		if(index<a.length)
		{
			a[index++]=num;
		}
		else
		{
			int []b=new int[a.length+1];
			for (int i = 0; i < a.length; i++)
			{
				b[i]=a[i];
			}
			a=b;
			a[index++]=num;
		}
		
	}
	public int pop()
	{
		if(index>=1)
		{
		index--;
		int num=a[index];
		a[index]=0;
		return num;
		}
		else
		{
			System.out.println("stack is empty");
			return 0;
		}
	}			
}
public class StackQuetion {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		MyStack s=new MyStack();
		
		s.push(10);;		
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		s.push(70);
		s.push(80);
		s.push(90);
		s.push(100);
		s.push(110);
		s.push(120);	
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
	}
}
