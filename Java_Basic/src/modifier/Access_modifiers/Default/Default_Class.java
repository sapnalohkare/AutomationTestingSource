package modifier.Access_modifiers.Default;

// 1) default class is not accessible outside the package 
// 3)within class,outside class,within package
// 2)thats why not able to create object of Default_Demo class which default

/* class, variable, method , constructor  accessible : within class : outside class : within package :*/
 class Default_Class 
{
	void display()
	{
		System.out.println("Display method : Default class..");
	}

	public static void main(String[] args) 
	{
		//within class
		Default_Class  default_object = new Default_Class();
		default_object.display();
		

	}

}

class Default_Demo
{
	
public static void main(String[] args)
{

	//outside the class within the pacakge
	Default_Class  default_object = new Default_Class();
	default_object.display();
	
}
}