package modifier.Constructor;

//default Constructor is accessible with class and within package


public class Default {

	
	Default()
	{
		System.out.println("Default Constructor ....");
		
	}
	
	
	public static void main(String[] args)
	{
		//within class-->done
		Default object = new Default();
		System.out.println(object);
	}

}


class ConstructorOut
{
	static
	{
		//within package
		Default object = new Default();
		System.out.println(object);
		
	}
}