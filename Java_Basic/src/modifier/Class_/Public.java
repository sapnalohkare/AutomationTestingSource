package modifier.Class_;

//within class, outside class,within package,outside the package

public class Public 
{

	public void display()
	{
		System.out.println("Demo method : public class.. ");
	}
	public static void main(String[] args)
	{
		//with in class
		Public object = new Public();
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
		 Public object = new Public();
		 object.display();
	}
}