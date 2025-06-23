package modifier.Access_modifiers.Private;

// variable accessible within class only 
public class Private_Method {
	
	private int a = 90;

	public static void main(String[] args) {
		
		Private_Method p = new Private_Method();
		System.out.println(p.a);
	}

}

class Private_Method_Demo
{
	
	//variable can not access outside the class
	Private_Method_Demo p = new Private_Method_Demo();
	
	/*System.out.println(p.a);//can not not access*/

}