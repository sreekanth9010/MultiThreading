package in.ineuron.MultiThreading;


class Myth implements Runnable
{
	String res1 = new String("BRAMHASTRA");
	String res2 = new String("SARPASTRA");
	String res3 = new String("PASUPASTRA");
	
	public void run()
	{
		String s1 = Thread.currentThread().getName();
		if(s1.equals("RAMA"))
		{
			ramaAcqRes();
		}
		else
		{
			ravanAcqRes();
		}
	}
	
	public void ramaAcqRes()
	{
		try
		{
			Thread.sleep(5000);
			
			synchronized(res1)
			{
			System.out.println("Rama has acquired " + res1);
			Thread.sleep(5000);
			
			synchronized(res2)
			{
				System.out.println("Rama has acquired " + res2);
				Thread.sleep(5000);
			
				synchronized(res3)
				{
					System.out.println("Rama has acquired " + res3);
				}
			
			}
			}
		}
		catch(Exception e)
		{
			System.out.println("some interuption has occured ");
		}
		
	}
	
	public void ravanAcqRes()
	{
		try
		{
			Thread.sleep(5000);
			
			synchronized(res1)
			{
			System.out.println("Ravana has acquired " + res1);
			Thread.sleep(5000);
			
			synchronized(res2)
			{
				System.out.println("Ravana has acquired " + res2);
				Thread.sleep(5000);
			
				synchronized(res3)
				{
					System.out.println("Ravana has acquired " + res3);
				}
			}
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("some interuption has occured ");
		}
	}
}
public class LaunchMythology {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Myth m = new Myth();
		Thread t1 = new Thread(m);
		Thread t2 = new Thread(m);
		
		t1.setName("RAMA");
		t2.setName("RAVANA");
		
		t1.start();
		t2.start();
		

	}

}
