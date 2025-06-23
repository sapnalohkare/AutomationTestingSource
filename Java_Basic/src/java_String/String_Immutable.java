package java_String;

//String is an immutable class which means a constant and cannot be changed once created
public class String_Immutable {

	public static void main(String[] args) {
		
		   //String name ="Automation"; //String Literal
		
			String name = new String("Automation");//Using new Keyword
			
			System.out.println(name.concat(" Testing"));
			
			System.out.println("---------Immutable String-------");
			
			System.out.println(name);
			

		
	

	}

}
