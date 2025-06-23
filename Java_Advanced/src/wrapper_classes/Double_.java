package wrapper_classes;

public class Double_ 
{

	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		System.out.println("-----convert primitive datatype to wrapper class object-----");
		
		double doubleVal = 45.889d;
		Double WrapperDoubleVal = Double.valueOf(doubleVal);
		
		System.out.println(WrapperDoubleVal);
		
		
		
		System.out.println("-----convert wrapper datatype to primitive class object ------");
		
		
		
		Double wrapperDouble =  new Double(568.084d);
		double doublePrimitive = wrapperDouble.doubleValue();
		
		System.out.println(doublePrimitive);
		
		
		
		System.out.println("--------------If string has value---------------------");
	     
	     String string = "678.89d";
	     Double strObj = Double.valueOf(string);
	     
	     System.out.println(strObj);
	     
	}
}
