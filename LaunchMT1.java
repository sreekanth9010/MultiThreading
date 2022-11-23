package in.ineuron.MultiThreading;

public class LaunchMT1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Banking Started....");
		for(int i=0;i<3;i++)
		{
			System.out.println("Banking......");
			Thread.sleep(2000);
		}
		System.out.println("---------------- ");
		
		
		System.out.println("Printing Started....");
		for(int i=0;i<3;i++)
		{
			System.out.println("Printing......");
			Thread.sleep(2000);
		}
		System.out.println("---------------- ");
		
		System.out.println("Calculation Started....");
		for(int i=0;i<3;i++)
		{
			System.out.println("Calculating......");
			Thread.sleep(2000);
		}
		

	}

}
