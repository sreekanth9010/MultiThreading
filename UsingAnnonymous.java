package in.ineuron.MultiThreading;

public class UsingAnnonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t = new Thread(new Runnable ()
				{
			public void run()
			{
				for(int i =1;i<=5;i++)
				{
					
					try {
						System.out.println("child thread");
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
				});
		t.start();
		for(int i =1;i<=5;i++)
		{
			
			try {
				System.out.println("main  thread");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
