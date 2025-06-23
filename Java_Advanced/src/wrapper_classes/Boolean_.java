package wrapper_classes;

public class Boolean_ 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		
	
	System.out.println("-----convert primitive datatype to wrapper class object-----");
	
	boolean bVal = false;
	
	//Wrapper class object
	Boolean WrapperBoolean = Boolean.valueOf(bVal);
	
	System.out.println(WrapperBoolean);
	
	System.out.println("-----convert wrapper datatype to primitive class object ------");
	
	
	Boolean wrapperVal = new Boolean(bVal);
	
	boolean primitiveBoolean = wrapperVal.booleanValue();
	System.out.println(primitiveBoolean);
	
	
	 System.out.println("--------------If string has value---------------------");
     
     String string = "False";
     Boolean booleanobjStr = Boolean.valueOf(string);
     
     System.out.println(booleanobjStr);
     
	
	}
}
