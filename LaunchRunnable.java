package in.ineuron.MultiThreading;


class Demo4 implements Runnable
{
	public void run()
	{
		System.out.println("Banking Started....");
		for(int i=0;i<3;i++)
		{
			System.out.println("Banking......");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("---------------- ");	
	}
}

class Demo5 implements Runnable
{
	public void run()
	{
		System.out.println("Printing Started....");
		for(int i=0;i<3;i++)
		{
			System.out.println("Printing......");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("---------------- ");	
	}
}

class Demo6 implements Runnable
{
	public void run()
	{
		System.out.println("Calculation Started....");
		for(int i=0;i<3;i++)
		{
			System.out.println("Calculating......");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
}
public class LaunchRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo4 d1 = new Demo4();
		Demo5 d2 = new Demo5();
		Demo6 d3 = new Demo6();
		
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d2);
		Thread t3 = new Thread(d3);
		
		
		
		t1.start();
		t2.start();
		t3.start();

	}

}
