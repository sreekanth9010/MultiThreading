package in.ineuron.MultiThreading;


class Ineuron extends Thread
{
	public void run()
	{
		try
		{
			
			System.out.println(Thread.currentThread().getName());
			System.out.println(Thread.currentThread().isAlive());
			System.out.println(Thread.currentThread().isDaemon());
			System.out.println(Thread.currentThread().isInterrupted());
			for(int i=0;i<5;i++)
			{
				System.out.println(i);
			}
			Thread.sleep(2000);
			
			synchronized(this)
			{
				
				System.out.println(Thread.currentThread().getName());
				System.out.println(Thread.currentThread().isAlive());
				System.out.println(Thread.currentThread().isDaemon());
				System.out.println(Thread.currentThread().isInterrupted());
				
				for (int i=0;i<5;i++)
				{
					System.out.println((char)(i+65));
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("some interuption has occured ..!");
		}
	}
}
public class LaunchSynchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ineuron i1 = new Ineuron();
		Ineuron i2 = new Ineuron();
		
		i1.setName("Ram");
		i2.setName("sita");
		
		i1.start();
		i2.start();

	}

}
