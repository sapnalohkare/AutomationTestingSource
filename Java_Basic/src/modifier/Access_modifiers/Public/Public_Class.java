package modifier.Access_modifiers.Public;

//within class, outside class,within package,outside the package

/* class, variable, method , constructor  accessible : within class : outside class : within package : outside package*/

public class Public_Class 
{

	public void display()
	{
		System.out.println("Demo method : public class.. ");
	}
	public static void main(String[] args)
	{
		//with in class
		Public_Class object = new Public_Class();
		object.display();

	}

}
 class Public_Demo 
{
	 public void display()
	 {
		 System.out.println("Public_Demo : same package");
	 }
	 
	 public static void main(String[] args) {
		
		 //public : inside the  package
		 Public_Class object = new Public_Class();
		 object.display();
	}
}