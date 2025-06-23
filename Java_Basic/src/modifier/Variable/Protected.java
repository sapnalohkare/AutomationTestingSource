package modifier.Variable;
//variable access within class outside class and outside package with the help of inheritance

public class Protected {
	
	
	protected int  a = 9;

	public static void main(String[] args) 
	{
		
		//within class
		Protected object = new Protected();
		System.out.println(object.a);
	}

}

 class User
 {
	 
	 static
	 { 
		 //outside the class and within the package
		 Protected object = new Protected();
		 System.out.println(object.a);
		 
	 }
	 

 }
 

 
 
