package in.ineuron.MultiThreading;


class Demo9 extends Thread
{
	int total=0;
	
	public void run()
	{
		synchronized(this)
		{
			System.out.println("Child thread started the calculation: ");
			for(int i=0;i<=100;i++)
			{
				total+=i;
			}
			System.out.println("Child thread is giving notification call ...");
			this.notify();
		}
		
	}
}
public class MainThreadCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo9 d = new Demo9();
		
		Thread t = new Thread(d);
		
		t.start();
		
		synchronized(d)
		{
			System.out.println("Main Thread is calling wait method...");
			try {
				d.wait();
				System.out.println("Main thread got the notification call ...");
				System.out.println(d.total);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}

	}

}
