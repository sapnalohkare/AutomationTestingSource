package this_;

public class Three_this_Constructor
{
	//3)this() can be used to invoke current class constructor.
	
	
	public Three_this_Constructor()
	{
		System.out.println("Current class constructor...");
	}
	
	public Three_this_Constructor(int a)
	{
		this();//call current class user define constructor..
		System.out.println("Parameterized constructor...");
	}
	
	public static void main(String[] args) 
	{
		
		Three_this_Constructor object = new Three_this_Constructor(7);
		System.out.println(object);

	}

}
