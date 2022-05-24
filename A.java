package synchronization.Multithreading;

public class A extends Thread
{
	Hello h;
	String msg;
	public A(Hello h, String msg) 
	{
		this.h= h;
		this.msg= msg;
		
	}
	@Override
	public void run() {
		
		h.display(msg);
	}
	
	
	


	
}
