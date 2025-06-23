package modifier.Access_modifiers.Protected;

//The method is accessible in the same package and subclasses. 
//outside the package with the help of inheritance
//package modifier.Testing.Test --check---

public class Protected_Method {

	public static void main(String[] args) {
		
		//same package
		employee emp = new employee();
		emp.code();

	}
	
	protected void testing()
	{
		System.out.println("testing...");
	}


}

class employee
{
	
	///The method  is accessible in the same package and subclasses.
	protected void code()
	{
		System.out.println("coding...");
	}


}

