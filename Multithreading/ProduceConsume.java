package Multithreading;

class T2 extends Thread{	
	shop s1;
	public T2(shop s) 
	{
		this.s1=s;
	}
	@Override
	public void run() {
		
		for(int i=0; i<=20; i++)
		{	
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				
			}
			s1.produce();
		}
		
	}

}

class T1 extends Thread{

	shop s2;
	public T1(shop s)
	{
		this.s2=s;
	}
	
	@Override
	public void run() {
		
		for(int i=0; i<=20; i++)
		{
		  
			try {Thread.sleep(1000);} catch (Exception e) {}
			s2.consume();
		}
		
	}
}
class shop {
	int stock=0;
	public synchronized void produce()
	{
		if(stock<=5)
		{
			notify();
		}
		stock++;
		System.out.println("produce "+stock);
	}
	public synchronized void consume()
	{
		
		if(stock<=3)
		{
			
			try {wait();} catch (InterruptedException e) {}
		}
		stock--;
		System.err.println("consume "+stock);
	}
}

public class ProduceConsume {

	public static void main(String[] args) {
		
		shop s=new shop();
		T1 t1=new T1(s);
		T2 t2=new T2(s);
		t1.start();
		t2.start();
	}
}
