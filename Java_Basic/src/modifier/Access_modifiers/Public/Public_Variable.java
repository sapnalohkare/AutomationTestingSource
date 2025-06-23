package modifier.Access_modifiers.Public;

//variable  is accessible  within class, outside class,within package,outside the package


public class Public_Variable {

	public int a = 70;
	public static void main(String[] args) {
		
		//within class
		Public_Variable p= new Public_Variable();
		System.out.println(p.a);
	}

}


class Username
{
	static 
	{
		//outside the class and within the package
		Public_Variable p= new Public_Variable();
	    System.out.println(p.a);
	}
}