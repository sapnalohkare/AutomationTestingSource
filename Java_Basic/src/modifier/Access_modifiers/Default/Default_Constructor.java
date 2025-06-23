package modifier.Access_modifiers.Default;

public class Default_Constructor {

	public Default_Constructor()
	{
		System.out.println("Default Constructor ....");
		
	}
	
	public static void main(String[] args)
	{
		//within class-->done
		Default_Constructor object = new Default_Constructor();
		System.out.println(object);
	}
	
	

}
class Default_Constructor_Demo 
{
	 public  String toString()
	 {
		 return "Default_Constructor_Demo : same package";
	 }
	 
	 public static void main(String[] args) {
		
		 //public : inside the  package
		 Default_Constructor object = new Default_Constructor();
		 System.out.println(object);
		 
	}
}

