package Multithreading;

class Abcd extends Thread{
	
	@Override
	public void run() {
	
		int a=1;
//		while(a<20)
//		{
//			
//			System.out.println(a);
//			a++;
//		}
	}
}
class Xyz extends Thread{
	
	@Override
	public void run() {
		double b=1.0;
//		while(b<20)
//		{
//			
//			System.out.println(b);
//			b++;
//		}
	}
	
	
}
public class DemoThread {

	public static void main(String[] args) {
		
		Abcd abcd=new Abcd();
		abcd.start();
		Xyz xyz =new Xyz();
		xyz.start();
		xyz.setPriority(10);
		abcd.setPriority(1);
		abcd.run();

		System.out.println(abcd.getPriority());
		System.out.println(xyz.getPriority());
		
		
	}
}
