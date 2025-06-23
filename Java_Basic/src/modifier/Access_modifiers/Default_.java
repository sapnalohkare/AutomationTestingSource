package modifier.Access_modifiers;

// 1) default class is not accessible outside the package 
// 3)within class,outside class,within package
// 2)thats why not able to create object of Default_Demo class which default

/* class, variable, method , constructor  accessible : within class : outside class : within package :*/
 class Default_ 
{
	void display()
	{
		System.out.println("Display method : Default class..");
	}

	public static void main(String[] args) 
	{
		//within class
		Default_  default_object = new Default_();
		default_object.display();
		

	}

}

class Default_Demo
{
	
public static void main(String[] args)
{

	//outside the class within the pacakge
	Default_  default_object = new Default_();
	default_object.display();
	
}
}