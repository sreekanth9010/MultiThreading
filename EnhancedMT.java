package in.ineuron.MultiThreading;

class Demo1 extends Thread
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

class Demo2 extends Thread
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

class Demo3 extends Thread
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
public class EnhancedMT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();
		
		d1.start();
		d2.start();
		d3.start();
		

	}

}
