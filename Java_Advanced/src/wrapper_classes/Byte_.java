package wrapper_classes;

public class Byte_ {

	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		
		System.out.println("-----convert primitive datatype to wrapper class object-----");
		 
		  byte a = 56;
		 
		  Byte byteobj = Byte.valueOf(a);
	
		  System.out.println(byteobj);
		 
		  
		  System.out.println("-----convert wrapper datatype to primitive class object ------");
		  
	      Byte byteOb = new Byte(a);
	      
	      int primitiveByte = byteOb.byteValue();
	      System.out.println(primitiveByte);
	      
	      
	      System.out.println("--------------If string has value---------------------");
	      
	      String string = "127";
	      Byte byteobjStr = Byte.valueOf(string);
	      
	      
	      
	      System.out.println(byteobjStr);
	      
		  
		  
	}
}
