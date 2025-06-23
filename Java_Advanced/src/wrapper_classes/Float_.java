package wrapper_classes;

public class Float_ 
{
	
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		
		System.out.println("-----convert primitive datatype to wrapper class object-----");
		
		float fVal = 56874.8654f;
		Float folatObj = Float.valueOf(fVal);
		
		System.out.println(folatObj);
		
		
		
		System.out.println("-----convert wrapper datatype to primitive class object ------");
		
		Float foltWrapperObject = new Float(fVal);
		float primitiveFloat = foltWrapperObject.floatValue();
		
		System.out.println(primitiveFloat);
		
		
		System.out.println("--------------If string has value---------------------");
	     
	     String string = "678.89f";
	     Float strObj = Float.valueOf(string);
	     
	     System.out.println(strObj);
		
		
	}

}
