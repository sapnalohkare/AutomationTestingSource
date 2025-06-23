package modifier.Access_modifiers.Public;

/*Default constructor will be automatically added by JVM at the time of object creation it is not created by programmer*/

public class Public_Constructor {
	
	public Public_Constructor()
	{
		System.out.println("Default Constructor ....");
		
	}
	
	public static void main(String[] args)
	{
		//within class-->done
		Public_Constructor object = new Public_Constructor();
		System.out.println(object);
	}
	
	

}
class Public_Constructor_Demo 
{
	 public  String toString()
	 {
		 return "Public_Constructor_Demo : same package";
	 }
	 
	 public static void main(String[] args) {
		
		 //public : inside the  package
		 Public_Constructor object = new Public_Constructor();
		 System.out.println(object);
		 
	}
}

