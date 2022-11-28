package in.ineuron.MultiThreading;
class Test 
{
	
	// Var-Args are multiple values stored in an array
	// Symbol is ...
	public int add(int...k)
	{
		int total=0;
		
		for(int i : k)
		{
			total+=i;
		}
		return total;
	}
}
public class LaunchVarArgs {

	public static void main(String...args) {
		
		Test t = new Test();
		int l=t.add(1,2,3,4,5,6,7,8,9,10);
		System.out.println(l);
		

	}

}
