package java_String;

//Not thread safe in nature

/*StringBuilder in Java represents an alternative to String and StringBuffer Class, 
as it creates a mutable sequence of characters and it is not thread safe*/
public class StringBuilder_ {

	public static void main(String[] args)
	{
		StringBuilder name = new StringBuilder("Automation");
		
		System.out.println(name.append(" Testing"));
		
		System.out.println("---------Mutable : not thread safe String : Used for single thread programe-------");
		
		System.out.println(name);

	}

}
