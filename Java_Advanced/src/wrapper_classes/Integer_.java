package wrapper_classes;

public class Integer_ 
{
	
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		
		System.out.println("-----convert primitive datatype to wrapper class object-----");
		
		int intVal = 90;
		Integer intObject = Integer.valueOf(intVal);
		
		System.out.println(intObject);
		
		
		System.out.println("-----convert wrapper datatype to primitive class object ------");
		
		Integer wrapperIntObj = new Integer(60);
		int primitiveIntVal = wrapperIntObj.intValue();
		
		System.out.println(primitiveIntVal);
		
		System.out.println("--------------If string has value---------------------");
	     
	    String string = "6007";
	    Integer strObj = Integer.valueOf(string);
	     
	     System.out.println(strObj);
	     
		
		
		
	}

}
