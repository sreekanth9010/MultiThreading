package in.ineuron.MultiThreading;


class FirstUser extends Thread
{
	
	StringBuffer sb ;
	
	

	public FirstUser() {
		
		sb= new StringBuffer();
	}
	
	public void run()
	{
		synchronized(sb)
		{
			for(int i=1;i<=10;i++)
			{
				
				try {
					sb.append(i+ ":");
					Thread.sleep(100);
					System.out.println("äppending....");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			sb.notify();
		}
	}
	
	
}

class EndUser extends Thread
{
	FirstUser producer;
	
	public EndUser(FirstUser producer)
	{
		this.producer=producer;
	}
	
	public void run()
	{
		synchronized(producer.sb)
		{
			try {
				producer.sb.wait();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println(producer.sb);
	}
	
	
}
public class BetterCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirstUser producer = new FirstUser();
		EndUser consumer = new EndUser(producer);
		
		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(consumer);
		
		t2.start();
		t1.start();

	}

}
