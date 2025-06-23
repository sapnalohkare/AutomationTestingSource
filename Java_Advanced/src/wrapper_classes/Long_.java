package wrapper_classes;

public class Long_ 
{
	@SuppressWarnings("removal")
	public static void main(String[] args)
	{
		System.out.println("-----convert primitive datatype to wrapper class object-----");
		
		long longVal = 56;
		Long wrapperObj = Long.valueOf(longVal);
		
		System.out.println(wrapperObj);
		
		System.out.println("-----convert wrapper datatype to primitive class object ------");
		
		Long wrapperObject = new Long(50);
		int primitiveInt =wrapperObject.intValue();	
		
		System.out.println(primitiveInt);
		
		System.out.println("--------------If string has value---------------------");
	     
	    String string = "800";
	    Long strObj = Long.valueOf(string);
	     
	    System.out.println(strObj);
		
		
		
	}

}
