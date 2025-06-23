package modifier.Access_modifiers.Protected;
//variable access within class outside class and outside package with the help of inheritance

public class Protected_Variable {
	
	
	protected int  a = 9;

	public static void main(String[] args) 
	{
		
		//within class
		Protected_Variable object = new Protected_Variable();
		System.out.println(object.a);
	}

}

 class User
 {
	 
	 static
	 { 
		 //outside the class and within the package
		 Protected_Variable object = new Protected_Variable();
		 System.out.println(object.a);
		 
	 }
	 

 }
 

 
 
