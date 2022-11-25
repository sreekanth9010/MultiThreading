package in.ineuron.MultiThreading;


class CreateImmutable
{
	
	private int i;
	CreateImmutable(int i )
	{
		this.i=i;
	}
	
	public  CreateImmutable modify(int i)
	{
		if(this.i==i)
		{
		return this;	
		}
		else 
		{
			return new CreateImmutable(i);
		}
	}
	
}
public class LaunchImmutableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateImmutable c = new CreateImmutable(10);

		
	
		CreateImmutable c1 =c.modify(100);
		
		CreateImmutable c2= c.modify(10);
		
		System.out.println(c.equals(c1));
		System.out.println(c.equals(c2));
	}

}
