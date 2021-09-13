package Multithreading;
class Abcd2 implements Runnable{

	@Override
	public void run() {
		System.out.println("Im from runnable interface");	
		try {
			for (int i = 0; i <=1000; i++) 
			{
				Thread.yield();
//				try {Thread.sleep(1000);} catch (InterruptedException e) {}
				System.out.println("hello");}} catch (Exception e) 	{}
		}
	
}
public  class RunnableDemo {

	public static void main(String[] args) throws Exception{
		
		Abcd2 abcd=new Abcd2();
		Thread t=new Thread(abcd);	
		
//		t.setDaemon(true);
//		System.out.println(t.isDaemon());
		t.start();
//		Pqr p=new Pqr();
		
		//is alive is used to for both thread are till alive they 
		//run after thath statement is printed same work as join thread
		
//		while(t.isAlive() || p.isAlive()) {}
		
		//Join is used to for both thread are working in the same time output will be
		 //print at aany point at thath time we use join method
		
//		t.join();
//		p.join();
//		System.out.println("work done");
		for (int i = 0; i <=1000; i++)
		{
//			Thread.yield();
			System.out.println("hi");
		}
		
		
		
	}
}

