package modifier.Access_modifiers;

//within class, outside class,within package,outside the package

/* class, variable, method , constructor  accessible : within class : outside class : within package : outside package*/

public class Public_ 
{

	public void display()
	{
		System.out.println("Demo method : public class.. ");
	}
	public static void main(String[] args)
	{
		//with in class
		Public_ object = new Public_();
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
		 Public_ object = new Public_();
		 object.display();
	}
}