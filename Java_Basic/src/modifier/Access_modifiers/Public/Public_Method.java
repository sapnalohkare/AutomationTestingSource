package modifier.Access_modifiers.Public;

//method is accessible  within class, outside class,within package,outside the package

public class Public_Method
{

	public static void main(String[] args) 
	{
		
		Public_Method obj = new Public_Method();
		
		//with in class
		obj.attack();

	}
	
	//method is accessible  within class, outside class,within package,outside the package
	public void attack()
	{
		System.out.println("Attack method....");
		
	}
	

}


class Army
{
	public static void main(String[] args) 
	{ 
		Public_Method object = new Public_Method();
		
		//outside class and inside package 
		object.attack();
		
	}

}