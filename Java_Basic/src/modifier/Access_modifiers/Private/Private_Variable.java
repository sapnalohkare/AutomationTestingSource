package modifier.Access_modifiers.Private;

// variable accessible within class only 
public class Private_Variable {
	
	private int a = 90;

	public static void main(String[] args) {
		
		Private_Variable p = new Private_Variable();
		System.out.println(p.a);
	}

}

class Demonstrate
{
	
	//variable can not access outside the class
	Private_Variable p = new Private_Variable();
	
	/*System.out.println(p.a);//can not not access*/

}