package wrapper_classes;

public class Character_ 
{
	
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		System.out.println("-----convert primitive datatype to wrapper class object-----");
		char charPrimitive = 'A';
		
		Character wrapperChar = Character.valueOf(charPrimitive);
		
		System.out.println(wrapperChar);
		
		System.out.println("-----convert wrapper datatype to primitive class object ------");
		
		Character charObj = new Character('B');
		
		char primitveChar = charObj.charValue();
		System.out.println(primitveChar);
		
		System.out.println("--------------If string has value---------------------");
	     
	     String string = "A";
	     Boolean strObj = Boolean.valueOf(string);
	     
	     System.out.println(strObj);
		
		
	}
	

}
