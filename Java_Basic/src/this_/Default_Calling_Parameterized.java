package this_;

public class Default_Calling_Parameterized {

	Default_Calling_Parameterized()
	{
		this(5,"Shubham");
		System.out.println("Default constructor ends..");
	}

	public Default_Calling_Parameterized(int age,String name)
	{

		System.out.println(age+" "+name);
	}

	public static void main(String[] args)
	{
		Default_Calling_Parameterized object = new Default_Calling_Parameterized();
		System.out.println(object);
	}

}
