package wrapper_classes;

public class Short_ 
{
@SuppressWarnings("removal")
public static void main(String[] args) 
{
		System.out.println("-----convert primitive datatype to wrapper class object-----");
		
		short shortval = 50;
		Short wrapperShort = Short.valueOf(shortval);
		
		System.out.println(wrapperShort);
		
		System.out.println("-----convert wrapper datatype to primitive class object ------");
		
		Short wrappershortObject = new Short(shortval);
		short primitiveShort = wrappershortObject.shortValue();
		 
		 System.out.println(primitiveShort);
		 
		 
		 System.out.println("--------------If string has value---------------------");
	     
		 String string = "8";
		 Short strObj = Short.valueOf(string);
		    
		 System.out.println(strObj);
}
}
