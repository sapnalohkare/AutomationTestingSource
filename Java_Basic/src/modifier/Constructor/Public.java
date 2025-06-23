package modifier.Constructor;

//Constructor  is accessible  within class, outside class,within package,outside the package

public class Public {

	public Public()
	{
		
		System.out.println("Public constructor : can access--> in class, outside class, "
				+ "within package , outside the package");
	}
	
	public static void main(String[] args) 
	{
		
		// within class
		Public object = new Public();
		System.out.println(object);
	}

}

 class Public_Constructor {

	public static void main(String[] args) 
	{
		
		// outside the class and inside the package
		Public object = new Public();
		System.out.println(object);
	}

}