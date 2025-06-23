package modifier.Method;

//methods belongs to the class, rather than an object

public class Static {

	public static void main(String[] args)
	{
		
		Static.details();
	}
	
	static void details()
	{
		System.out.println("static method does not need object");
	}

}

class flower
{
	static 
	{
		System.out.println("static block..");
		Static.details();
		
	}
	
}
