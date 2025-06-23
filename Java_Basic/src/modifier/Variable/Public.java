package modifier.Variable;

//variable  is accessible  within class, outside class,within package,outside the package


public class Public {

	public int a = 70;
	public static void main(String[] args) {
		
		//within class
		Public p= new Public();
		System.out.println(p.a);
	}

}


class Username
{
	static 
	{
		//outside the class and within the package
		Public p= new Public();
	    System.out.println(p.a);
	}
}