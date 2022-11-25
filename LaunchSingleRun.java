package in.ineuron.MultiThreading;


class Alpha extends Thread
{
	public void run()
	{
		if(Thread.currentThread().getName()=="BANK")
		{
			bank();
			System.out.println(Thread.currentThread().isAlive());
		}
		else if(Thread.currentThread().getName()=="PRINT")
		{
			print();
			System.out.println(Thread.currentThread().isAlive());
		}
		else
		{
			cal();
			System.out.println(Thread.currentThread().isAlive());
		}
	}
	
	public void bank()
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
	public void print()
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
	
	public void cal()
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
public class LaunchSingleRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alpha a1 = new Alpha();
		Alpha a2 = new Alpha();
		Alpha a3 = new Alpha();
		
		a1.setName("BANK");
		a2.setName("PRINT");
		a3.setName("CALC");
		
		a1.start();
		a2.start();
		a3.start();
	}

}
