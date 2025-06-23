package modifier.Variable;

// variable accessible within class only 
public class Private {
	
	private int a = 90;

	public static void main(String[] args) {
		
		Private p = new Private();
		System.out.println(p.a);
	}

}

class Demonstrate
{
	
	//variable can not access outside the class
	Private p = new Private();
	
	/*System.out.println(p.a);//can not not access*/

}