package modifier.Variable;

//static variable can be directly access with class name
public class Static {

	static String name = "Fujitsu";
	public static void main(String[] args) 
	{
		//2 ways to access static variable 
		System.out.println("1) : " +name);
		System.out.println("2) : " +Static.name);

	}

}
