package modifier.Method;

//method is accessible  within class, outside class,within package,outside the package

public class Public
{

	public static void main(String[] args) 
	{
		
		Public obj = new Public();
		
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
		Public object = new Public();
		
		//outside class and inside package 
		object.attack();
		
	}

}