package modifier.Variable;

//default variable is accessible : with class : outside class  : within package

public class Default {
	int a = 9;
	
	public static void main(String[] args) {

		
		//within the class
		Default ob = new Default();

		System.out.println(ob.a);

	}

}

class Default_Demo {

	static {
		
		// outside class and inside package
		Default ob = new Default();

		System.out.println(ob.a);
	}

}
