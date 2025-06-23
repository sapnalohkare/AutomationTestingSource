package constructor;

public class Parameter_Constructor 
{

	/* if  Parameter Constructor available then that will be call directly*/

	public Parameter_Constructor(int a, String name)
	{
		System.out.println("Parameter_Constructor... "+ a+" : "+name);
	}
	
	public static void main(String[] args) 
	{
		Parameter_Constructor  object = new Parameter_Constructor(45, "Anvi Bhagat");
		System.out.println(object);//just to remove warning

	}

}
