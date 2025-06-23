package modifier.Constructor;

//Constructor can access within class outside class and outside package with the help of inheritance

public class Protected {
	
	protected Protected()
	{
		System.out.println("Constructor can access within class , outside class "
				+ "and outside package with the help of inheritance");
		
	}

	public static void main(String[] args) 
	{
		Protected object = new Protected();
		System.out.println(object);
		

	}

}

class Protected_demo{
	
	public static void main(String[] args)
	{
		//outside class and  within same package
		Protected object = new Protected();
		System.out.println(object);
		
	}
	
	
	
}

class Inheritance_Protected_demo extends Protected
{
static
{
	//outside class and  within same package
			Protected object = new Protected();
			System.out.println(object);

}
}
